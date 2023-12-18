import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Main {

	/**
	 * @param args
	 */
	static final double EPS = 1e-8;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for(;;){
			int n=cin.nextInt();
			if(n==0)break;
			double[][] cir=new double[n][3];
			for(int i=0;i<n;i++){
				String s[]=cin.next().split(",");
				cir[i][0]=Double.parseDouble(s[0]);
				cir[i][1]=Double.parseDouble(s[1]);
				cir[i][2]=1.0;
			}
			PrimitiveGeom pg=new PrimitiveGeom();
			List<double[]>list=new LinkedList<double[]>();
			for(int i=0;i<n;i++){
				for(int j=i+1;j<n;j++){
					if(pg.checkCircleOverlap(
							cir[i][0],
							cir[i][1],
							cir[i][2],
							cir[j][0],
							cir[j][1],
							cir[j][2])==2){
						
						double[][] pp=pg.circleCrossPoint(
								cir[i][0],
								cir[i][1],
								cir[i][2],
								cir[j][0],
								cir[j][1],
								cir[j][2]);
						list.add(pp[0]);
						list.add(pp[1]);
					}
					else{
						double dis=Math.sqrt(Math.pow(cir[i][0]-cir[j][0],2)+
								Math.pow(cir[i][1]-cir[j][1],2));
						if(dis+EPS>2.0&&dis-EPS<2.0){
							double[] mid = pg.mid(new double[]{cir[i][0],cir[i][1]},
									new double[]{cir[j][0],cir[j][1]});
							list.add(mid);
						}
					}
				}
			}
			
			int ans=0;
			for(double[] p:list){
				int cnt=0;
//				System.out.println(p[0]+" "+p[1]);
				for(int i=0;i<n;i++){
					double dist=Math.sqrt(
							(cir[i][0]-p[0])*(cir[i][0]-p[0])+
							(cir[i][1]-p[1])*(cir[i][1]-p[1])
					);
//					System.out.println(dist);
					if(dist-EPS<1.0){
						cnt++;
					}

				}
//				System.out.println(cnt);
				ans=Math.max(cnt,ans);
			}
			System.out.println(ans);
			
			
			
		}

	}



	//Verify: AOJ1157 AOJ0237 AOJ2402
	static class PrimitiveGeom {


		final double[] BASE = {1, 0};

		// 内積
		double dot(double[] a, double[] b){
			return a[0]*b[0]+a[1]*b[1];
		}
		
		// 外積
		double cross(double[] a, double[] b){
			return a[0]*b[1]-a[1]*b[0];
		}
		
		// (0,0)->(a[0],a[1])の長さ
		double norm(double[] a){
			return Math.sqrt(a[0]*a[0]+a[1]*a[1]);
		}
		// (a[0],a[1])->(b[0],b[1])の長さ
		double norm(double[] a, double[] b){
			return norm(sub(a, b));
		}
		// a-bのベクトル( a + (-b) )
		double[] sub(double[] a, double[] b){
			return new double[]{a[0]-b[0], a[1]-b[1]};
		}
		// 中点
		double[] mid(double[] a, double[] b){
			return new double[]{(a[0]+b[0])/2, (a[1]+b[1])/2};
		}
		
		// 三角形の面積
		double area(double[] a, double[] b, double[] c){
			double res = cross(a, b)+cross(b, c)+cross(c, a);
			return Math.abs(res)/2;
		}
		
		// aとb交換
		void swap(double[] a, double[] b){
			double t = a[0];
			a[0] = b[0]; b[0] = t;
			t = a[1];
			a[1] = b[1]; b[1] = t;
		}
		
		// 不明
		double ex(double[] a, double[] b, double[] c){
			double[] s1 = sub(b, a), s2 = sub(c, a);
			return cross(s1, s2);
		}
		
		// aとbのなす角
		double angleTan(double[] a, double[] b){
			return Math.atan2(cross(a, b), dot(a, b));
		}
		// aとbのなす角
		//NaNを返す場合があるので要注意。参考はAOJ1033
		double angleCos(double[] a, double[] b){
			double na = norm(a), nb = norm(b);
			return Math.acos(dot(a, b)/na/nb);
		}
		boolean crossing(double[] a, double[] b, double[] s, double[] t){
			//A-B, S-Tが共に平行の場合、2線分間の距離が0か否かで交差を判定する
			if(Math.abs(cross(sub(b, a), sub(t, s)))<EPS){
				return Math.min(dist(a, b, s), Math.min(dist(a, b, t), Math.min(dist(s, t, a), dist(s, t, b))))<EPS;
			}
			if(ex(a, b, s)*ex(a, b, t)>0)return false;
			if(ex(b, a, s)*ex(b, a, t)>0)return false;
			if(ex(s, t, a)*ex(s, t, b)>0)return false;
			return ex(t, s, a)*ex(t, s, b)<EPS;
			//ここでex(,,)*ex(,,)<EPSとすると、(0,0)(1,0)-(2,0)(3.0)のような一直線に並んでいて交差していないものもtrueとなってしまう
			//→平行な場合は先頭のif文内で処理するようになった
		}
		//Verify AOJ1301
		//Segment a-b Point p
		double dist(double[] a, double[] b, double[] p){
			if(dot(sub(b, a), sub(p, a))<EPS)return norm(a, p);
			if(dot(sub(a, b), sub(p, b))<EPS)return norm(b, p);
			return Math.abs(cross(sub(b, a), sub(p, a)))/norm(a, b);
		}
		//Segment a-b Segment s-t
		double dist(double[] a, double[] b, double[] s, double[] t){
			if(crossing(a, b, s, t))return 0;
			return Math.min(dist(a, b, s), Math.min(dist(a, b, t), Math.min(dist(s, t, a), dist(s, t, b))));
		}
		//Verify: AOJ2201
		//Line a-b Point p
		double distLP(double[] a, double[] b, double[] p){
			return Math.abs(cross(sub(b, a), sub(p, a)))/norm(a, b);
		}
		//Verify AOJ1301, AOJ2009
		double[] cp(double[] a, double[] b, double[] s, double[] t){
			double ds = distLP(a, b, s), dt = distLP(a, b, t);
			double k = ds/(ds+dt);
			double[] d = sub(t, s);
			return new double[]{s[0]+k*d[0], s[1]+k*d[1]};
		}

		//ベクトルA (0, 0)-(a[0], a[1])をthita回転させる
		double[] rotate(double[] a, double thita){
			return new double[]{Math.cos(thita)*a[0]-Math.sin(thita)*a[1], Math.sin(thita)*a[0]+Math.cos(thita)*a[1]};
		}
		
		//a -> b -> c と進むときの進行方向
		//+1: counter clockwise
		//-1: clockwise
		//+2: c--a--b online
		//-2: a--b--c online
		int ccw(double[] a, double[] b, double[] c){
			b = sub(b, a); c = sub(c, a);
			if(cross(b, c) > 0)return 1;
			if(cross(b, c) < 0)return -1;
			if(dot(b, c) < 0)return +2;
			if(norm(b) < norm(c))return -2;
			return 0;
		}

		//Verify: AOJ1047
		//-2: 重なりを持たない(半径の小さい方が半径の大きい方に内包されている)
		//-1: 内接している(半径の小さい方が半径の大きい方に内接している)
		// 0: 離れている
		// 1: 外接している
		// 2: 交差している
		int checkCircleOverlap(double x1, double y1, double r1, double x2, double y2, double r2){
			double d = (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2), r = (r1-r2)*(r1-r2), R = (r1+r2)*(r1+r2);
			if(R < d)return 0;
			if(Math.abs(d-R)<EPS)return 1;
			if(r < d && d < R)return 2;
			if(Math.abs(d-r)<EPS)return -1;
			return -2;
		}

		//Verify: AOJ1183, AOJ1047
		//現在、円同士が交点2つ持つという前提になっている
		//2円の共通部分が分かるように返り値はres[0]〜res[1]が(x1, y1)の円からみて反時計回りに並ぶように返す -> AOJ1047 verify
		double[][] circleCrossPoint(double x1, double y1, double r1, double x2, double y2, double r2){
			double vx = x2-x1, vy = y2-y1, D = Math.sqrt(vx*vx+vy*vy);
			vx/=D; vy/=D;
			vx*=r1; vy*=r1;
			double thita = Math.acos((r1*r1+D*D-r2*r2)/(2*r1*D));
			double px = Math.cos(thita)*vx-Math.sin(thita)*vy, py = Math.sin(thita)*vx+Math.cos(thita)*vy;
			double px2 = Math.cos(-thita)*vx-Math.sin(-thita)*vy, py2 = Math.sin(-thita)*vx+Math.cos(-thita)*vy;
			double[][] res = new double[2][2];
			res[0][0] = x1+px; res[0][1] = y1+py;
			res[1][0] = x1+px2; res[1][1] = y1+py2;
			if(ccw(new double[]{x1, y1}, new double[]{x2, y2}, res[0])==1)swap(res[0], res[1]);
			return res;
		}
		
		// 時々NaNになるけど気にしない？
		//Verify: AOJ2201
		//2円の共通接線のリストを返す
		//点(double[0][0], double[0][1]) - (double[1][0], double[1][1])を通る直線を表す
		//また、点は円と接する点でもあるので問題によっては線分と解釈してもアリ(接点が1つの場合は別)
		//中心も半径も同じ円同士だと多分死ぬ
		List<double[][]> circleTangentialLine(double x1, double y1, double r1, double x2, double y2, double r2){
			List<double[][]> res = new ArrayList<double[][]>();
			int crossPointN = checkCircleOverlap(x1, y1, r1, x2, y2, r2);
			//一方の円が他方の円に内包されているので共通接線なし
			if(crossPointN==-2)return res;
			double[] P = {x1, y1}, Q = {x2, y2};
			//一方の円が他方の円に内接しているので共通接線は1本
			if(crossPointN==-1){
				if(r2 < r1){
					double[] v = sub(Q, P);
					double d = norm(v);
					v[0] = v[0]/d*r1;
					v[1] = v[1]/d*r1;
					double[] r = rotate(v, Math.PI/2);
					res.add(new double[][]{{P[0]+v[0], P[1]+v[1]}, {P[0]+v[0]+r[0], P[1]+v[1]+r[1]}});
				}
				else{
					double[] v = sub(P, Q);
					double d = norm(v);
					v[0] = v[0]/d*r2;
					v[1] = v[1]/d*r2;
					double[] r = rotate(v, Math.PI/2);
					res.add(new double[][]{{Q[0]+v[0], Q[1]+v[1]}, {Q[0]+v[0]+r[0], Q[1]+v[1]+r[1]}});
				}
				return res;
			}
			//外側接線を調べる
			double[] sub = sub(Q, P);
			double d = norm(sub);
			sub[0]/=d; sub[1]/=d;
			double thita = Math.acos(Math.sqrt(d*d-(r1-r2)*(r1-r2))/d);
			double[] v1, v2;
			if(r2 < r1){
				v1 = rotate(sub, Math.PI/2-thita); v2 = rotate(sub, thita-Math.PI/2);
			}
			else{
				v1 = rotate(sub, Math.PI/2+thita); v2 = rotate(sub, -(Math.PI/2+thita));
			}
			res.add(new double[][]{{P[0]+v1[0]*r1, P[1]+v1[1]*r1}, {Q[0]+v1[0]*r2, Q[1]+v1[1]*r2}});
			res.add(new double[][]{{P[0]+v2[0]*r1, P[1]+v2[1]*r1}, {Q[0]+v2[0]*r2, Q[1]+v2[1]*r2}});
			//外接点を通るような内側接線が1本ある
			if(crossPointN==1){
				double[] v = {sub[0]*r1, sub[1]*r1};
				double[] r = rotate(v, Math.PI/2);
				res.add(new double[][]{{P[0]+v[0], P[1]+v[1]}, {P[0]+v[0]+r[0], P[1]+v[1]+r[1]}});
			}
			//内側接線は2本ある
			else{
				double A = r1*d/(r1+r2), CC = r1*r1*(d*d-(r1+r2)*(r1+r2))/((r1+r2)*(r1+r2));
				thita = Math.acos((r1*r1+A*A-CC)/(2*A*r1));
				v1 = rotate(sub, thita); v2 = rotate(sub, -thita);
				double[] u1 = {-v1[0], -v1[1]}, u2 = {-v2[0], -v2[1]};
				res.add(new double[][]{{P[0]+v1[0]*r1, P[1]+v1[1]*r1}, {Q[0]+u1[0]*r2, Q[1]+u1[1]*r2}});
				res.add(new double[][]{{P[0]+v2[0]*r1, P[1]+v2[1]*r1}, {Q[0]+u2[0]*r2, Q[1]+u2[1]*r2}});
			}
			return res;
		}

		//Verify: AOJ1047
		//円周の範囲クラス
		//円周上で他の円に覆われていない部分などを調べる
		//BASEと、円周上の点PのangleTan(BASE, sub(P, 円の中心)) = θ[-π, π]の値を使う。
		//順序は大切。必ず(BASE, P)の順にすること
		//IDEA: add版も必要になるかも
		class CircumferenceRange{
			List<double[]> ranges;
			public CircumferenceRange() {
				ranges = new ArrayList<double[]>();
				ranges.add(new double[]{0, 2*Math.PI});
			}
			private double trans(double thita){
				return thita<0?2*Math.PI+thita:thita;
			}
			void sub(double from, double to){
				double f = trans(from), t = trans(to);
				if(t < f){
					subOffer(0, t);
					subOffer(f, 2*Math.PI);
				}
				else subOffer(f, t);
			}
			private void subOffer(double from, double to){
				for(int i=0;i<ranges.size();i++){
					double[] d = ranges.get(i);
					//被さる範囲なし
					if(to < d[0] || d[1] < from)continue;
					//全て覆っている
					if(from < d[0]+EPS && d[1] < to+EPS){
						ranges.remove(i--);
					}
					//中心部分を覆って、2つに分かれる
					else if(d[0] < from && to < d[1]){
						ranges.remove(i);
						ranges.add(i, new double[]{to, d[1]});
						ranges.add(i++, new double[]{d[0], from});
					}
					//左側を覆う
					else if(to < d[1]){
						ranges.remove(i);
						ranges.add(i, new double[]{to, d[1]});
					}
					//右側を覆う if(d[0] < from)はいらないはず
					else {
						ranges.remove(i);
						ranges.add(i, new double[]{d[0], from});
					}
				}
			}
			public String toString() {
				StringBuilder sb = new StringBuilder();
				for(double[]d:ranges)sb.append("["+(d[0]*180/Math.PI)+","+(d[1]*180/Math.PI)+"]");
						return sb.toString();		
			}
		}

		//最小包含円の中心を求める
		//Verify: CodeArtOnline(AOJ????)
		double[] smallestCircle(double[][] p){
			int n = p.length;
			double[] pos = new double[2];
			for(int i=0;i<n;i++)for(int j=0;j<2;j++)pos[j]+=p[i][j];
			pos[0]/=n; pos[1]/=n;
			double ratio = 0.5;
			while(ratio > EPS){
				for(int t=0;t<50;t++){
					double max = -1;
					int id = -1;
					for(int i=0;i<n;i++){
						double d = norm(pos, p[i]);
						if(max < d){
							max = d; id = i;
						}
					}
					double[] dt = sub(p[id], pos);
					pos[0]+=dt[0]*ratio;
					pos[1]+=dt[1]*ratio;
				}
				ratio/=2;
			}
			return pos;
		}

		//最小包含球
		//EPSやtのループ回数50は根拠がないが大体うまくいくことが期待される
		//Verify AOJ1231
		double[] smallestSphere(double[][] p){
			int n = p.length;
			double[] pos = new double[3];
			for(int i=0;i<n;i++)for(int j=0;j<3;j++)pos[j]+=p[i][j];
			for(int j=0;j<3;j++)pos[j]/=n;
			double ratio = 0.5;
			while(ratio > EPS){
				for(int t=0;t<50;t++){
					double max = -1;
					int id = -1;
					for(int i=0;i<n;i++){
						double d = 0;
						for(int j=0;j<3;j++)d+=(pos[j]-p[i][j])*(pos[j]-p[i][j]);
						if(max < d){
							max = d; id = i;
						}
					}
					double dx = p[id][0]-pos[0], dy = p[id][1]-pos[1], dz = p[id][2]-pos[2];
					pos[0]+=dx*ratio;
					pos[1]+=dy*ratio;
					pos[2]+=dz*ratio;
				}
				ratio/=2;
			}
			return pos;
		}



		//Verify AOJ1033
		//点AとBの大小を比較する
		//A <= Bでtrue
		boolean pointCompare(double[] a, double[] b){
			if(Math.abs(a[0]-b[0]) < EPS)return ((int)Math.signum(a[1]-b[1]))<=0;
			return ((int)Math.signum(a[0]-b[0]))<=0;
		}

		boolean enableMerge(double[][] s, double[][] t, double[][] res){
			if(Math.abs(cross(sub(s[1], s[0]), sub(t[1], t[0]))) > EPS)return false;
			if(Math.abs(ccw(s[0], t[0], s[1]))==1)return false;
			if(ccw(s[0], s[1], t[0])==-2 || ccw(t[0], t[1], s[0])==-2)return false;
			double[] S = pointCompare(s[0], t[0])?s[0]:t[0], T = pointCompare(s[1], t[1])?t[1]:s[1];
			res[0] = S;
			res[1] = T;
			return true;
		}

		//Verify AOJ1033
		//平行な線分がオーバーラップしている場合、統合してキレイにする
		double[][][] mergeSegment(double[][][] seg){
			List<double[][]> segs = new ArrayList<double[][]>();
			for(int i=0;i<seg.length;i++){
				if(!pointCompare(seg[i][0], seg[i][1]))swap(seg[i][0], seg[i][1]);
				segs.add(seg[i]);
			}
			double[][] tmp = new double[2][2];
			for(int i=0;i<segs.size();i++){
				for(int j=i+1;j<segs.size();j++){
					if(enableMerge(segs.get(i), segs.get(j), tmp)){
						segs.remove(j--);
						segs.remove(i);
						segs.add(i, new double[][]{{tmp[0][0],tmp[0][1]},{tmp[1][0],tmp[1][1]}});
					}
				}
			}
			int N = segs.size();
			double[][][] res = new double[N][2][2];
			for(int i=0;i<N;i++){
				res[i] = segs.get(i);
			}
			return res;
		}

		//線分アレンジメントetc で使わざるを得ない辺のデータ構造
		//id: 点の番号（線分アレンジメントならresPointに対応する）
		//dist: 2点間の距離
		//線分アレンジメントで必要になるため、Eに直接Comparableを付けている
		class E implements Comparable<E>{
			int id;
			double dist;
			public E(int id, double dist) {
				this.id = id;
				this.dist = dist;
			}
			public int compareTo(E o) {
				return (int)Math.signum(dist-o.dist);
			}
		}

	}
}