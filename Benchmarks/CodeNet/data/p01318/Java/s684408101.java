import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	int N;
	int[][] circle;
	void run(){
		Scanner cin = new Scanner(System.in);
		for(;;){
			N=cin.nextInt();
			if(N==0)break;
			circle = new int[N][7];
			// 0x　1y　2半径　3磁力　4外の円x　5外の円y　6外の円半径
			for(int i=0;i<N;i++){
				circle[i][0]=cin.nextInt();
				circle[i][1]=cin.nextInt();
				circle[i][2]=cin.nextInt();
				circle[i][3]=cin.nextInt();
				circle[i][4]=circle[i][0];
				circle[i][5]=circle[i][1];
				circle[i][6]=circle[i][2]+circle[i][3];
			}
			List<double[][]> lines=new LinkedList<double[][]>();
			for(int i=0;i<N;i++){
				for(int j=i+1;j<N;j++){
					List<double[][]> list=circleTangentialLine(circle[i][0],circle[i][1],circle[i][2],
							circle[j][0],circle[j][1],circle[j][2]);
					for(double[][] a:list){
						lines.add(a);
//						System.out.println(0+" "+i+" "+j+" "+a[0][0]+" "+a[0][1]+" "+a[1][0]+" "+a[1][1]);
					}
					list=circleTangentialLine(circle[i][0],circle[i][1],circle[i][2],
							circle[j][4],circle[j][5],circle[j][6]);
					for(double[][] a:list){
						lines.add(a);
//						System.out.println(i+" "+j+" "+a[0][0]+" "+a[0][1]+" "+a[1][0]+" "+a[1][1]);
					}
					
					list=circleTangentialLine(circle[i][4],circle[i][5],circle[i][6],
							circle[j][4],circle[j][5],circle[j][6]);
					for(double[][] a:list){
						lines.add(a);
//						System.out.println(i+" "+j+" "+a[0][0]+" "+a[0][1]+" "+a[1][0]+" "+a[1][1]);
					}

					list=circleTangentialLine(circle[i][4],circle[i][5],circle[i][6],
							circle[j][0],circle[j][1],circle[j][2]);
					for(double[][] a:list){
						lines.add(a);
//						System.out.println(i+" "+j+" "+a[0][0]+" "+a[0][1]+" "+a[1][0]+" "+a[1][1]);
					}
				}
			}
			int ans=1;
			for(double[][] a:lines){
				
//				System.out.println(cnt(a));
				ans=Math.max(ans, cnt(a));
			}
			System.out.println(ans);
		}
	}
	int cnt(double[][] line){
		int res = 0;
		for(int i=0;i<N;i++){
			double d = distLP(line[0], line[1], new double[]{circle[i][0],circle[i][1]});
			if(circle[i][2] <= d && d <= circle[i][6])res++;
		}
		return res;
	}
	
	double distLP(double[] a, double[] b, double[] p){
		return Math.abs(cross(sub(b, a), sub(p, a)))/norm(a, b);
	}
	double norm(double[] a, double[] b){
		return norm(sub(a, b));
	}
	double cross(double[] a, double[] b){
		return a[0]*b[1]-a[1]*b[0];
	}
	public static void main(String[] args) {
		new Main().run();
	}
	
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
//			System.out.println(x1+" "+y1+ " "+r1);
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
//			System.out.println(x1+" "+y1+" "+r1+" "+x2+" "+y2+" "+r2);
			double A = r1*d/(r1+r2), CC = r1*r1*(d*d-(r1+r2)*(r1+r2))/((r1+r2)*(r1+r2));
			thita = Math.acos((r1*r1+A*A-CC)/(2*A*r1));
//			System.out.println("thita "+" "+thita);
			v1 = rotate(sub, thita); v2 = rotate(sub, -thita);
			double[] u1 = {-v1[0], -v1[1]}, u2 = {-v2[0], -v2[1]};
//			System.out.println(P[0]+" "+v1[0]+" "+r1);
//			System.out.println(P[0]+v1[0]*r1);
			for(double[][] a:res){
//				System.out.println(a[0][0]+" "+a[0][1]+" "+a[1][0]+" "+a[1][1]);
			}
			res.add(new double[][]{{P[0]+v1[0]*r1, P[1]+v1[1]*r1}, {Q[0]+u1[0]*r2, Q[1]+u1[1]*r2}});
			res.add(new double[][]{{P[0]+v2[0]*r1, P[1]+v2[1]*r1}, {Q[0]+u2[0]*r2, Q[1]+u2[1]*r2}});
			for(double[][] a:res){
//				System.out.println(a[0][0]+" "+a[0][1]+" "+a[1][0]+" "+a[1][1]);
			}
		}
		
		for(double[][] a:res){
//			System.out.println(a[0][0]+" "+a[0][1]+" "+a[1][0]+" "+a[1][1]);
		}
		return res;
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
	//ベクトルA (0, 0)-(a[0], a[1])をthita回転させる
	double[] rotate(double[] a, double thita){
		return new double[]{Math.cos(thita)*a[0]-Math.sin(thita)*a[1], Math.sin(thita)*a[0]+Math.cos(thita)*a[1]};
	}
	final double EPS = 1e-8;
	final double[] BASE = {1, 0};

	double[] sub(double[] a, double[] b){
		return new double[]{a[0]-b[0], a[1]-b[1]};
	}
	double norm(double[] a){
		return Math.sqrt(a[0]*a[0]+a[1]*a[1]);
	}
}