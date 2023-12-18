import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Main {

	static int H,W;
	static int[][] f,minf;
	static int sx,sy,gx,gy;
	static int[] v1={0,1,0,-1};
	static int[] v2={1,0,-1,0};
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for(;;){
			H=cin.nextInt();
			W=cin.nextInt();
			if(H+W==0)break;
			f=new int[H][W];
			minf=new int[H][W];
			for(int i=0;i<H;i++){
				for(int j=0;j<W;j++){
					f[i][j]=cin.nextInt();
					minf[i][j]=1<<30;
				}
			}
			sx=cin.nextInt();
			sy=cin.nextInt();
			gx=cin.nextInt();
			gy=cin.nextInt();
			
			PriorityQueue<Dice> q = new PriorityQueue<Dice>(200,new Comparator<Dice>(){
				public int compare(Dice o1, Dice o2) {
					return o1.min-o2.min;
				}
			});
			Dice ddd= new Dice(1,6,2,5,3,4);
			ddd.x=ddd.y=ddd.min=0;
			q.add(ddd);
			int ans=1<<30;
			while(!q.isEmpty()){
				Dice d = q.poll();
				int x=d.x;
				int y=d.y;
				int min=d.min;
//				System.out.println(x+" "+y+" "+min+" "+d);
				if(x==gx&&y==gy){
					ans=Math.min(min,ans);;
				}
				if(minf[x][y]<=min)continue;
				minf[x][y]=min;
				for(int i=0;i<4;i++){
					int xx=x+v1[i];
					int yy=y+v2[i];
					if(xx<0||xx>=H||yy<0||yy>=W)continue;
					Dice next=roll(d,v1[i],v2[i]);
					next.min=d.min+((Integer)next.id[1]*f[xx][yy]);
					next.x=xx;
					next.y=yy;
					q.add(next);
				}
			}
			System.out.println(ans);
		}
			
	}
	static Dice roll(Dice d,int a,int b){
		Dice re;
		if(a==0){
			if(b==1){
				d.rollY(false);
				re=d.copy();
				d.rollY(true);
			}
			else{
				d.rollY(true);
				re=d.copy();
				d.rollY(false);
			}
		}
		else if(a==1){
			d.rollX(true);
			re=d.copy();
			d.rollX(false);
		}
		else{
			d.rollX(false);
			re=d.copy();
			d.rollX(true);
		}
		return re;
	}

	//さいころのデータクラス
	//equalsは向きも含めて同値であり,isEquivalentは回転することで同じ賽であることを調べる
	//Verify: AOJ0502, AOJ1057
	static class Dice <T>{
		public int x,y,min;
		public T[] id;
			enum Face{TOP, BOTTOM, FRONT, BACK, RIGHT, LEFT};
			
			public T get(Face f){
				return id[f.ordinal()];
			}
			
			public Dice<T> copy(){
				return new Dice<T>(id[0], id[1], id[2], id[3], id[4], id[5]);
			}
			
			public Dice() {
				@SuppressWarnings("unchecked")
				T[] tid = (T[])new Object[6];
				id = tid;
			}
			
			public Dice(T top, T bottom, T front, T back, T right, T left) {
				@SuppressWarnings("unchecked")
				T[] tid = (T[])new Object[6];
				id = tid;
				id[Face.TOP.ordinal()] = top;
				id[Face.BOTTOM.ordinal()]= bottom;
				id[Face.FRONT.ordinal()] = front;
				id[Face.BACK.ordinal()] = back;
				id[Face.RIGHT.ordinal()] = right;
				id[Face.LEFT.ordinal()] = left;
			}
			
			//true: X軸方向に手前に転がす
			//false: X軸方向に奥に転がす
			void rollX(boolean isReverse) {
				if(!isReverse) roll(Face.TOP, Face.FRONT, Face.BOTTOM, Face.BACK);
				else roll(Face.TOP, Face.BACK, Face.BOTTOM, Face.FRONT);
			}
			
			//true: Y軸方向に左へ転がす
			//false: Y軸方向に右へ転がす
			void rollY(boolean isReverse) {
				if(!isReverse) roll(Face.TOP, Face.LEFT, Face.BOTTOM, Face.RIGHT);
				else roll(Face.TOP, Face.RIGHT, Face.BOTTOM, Face.LEFT);
			}
			
			//true: Z軸方向に右へ回す
			//false: Z軸方向に左へ回す
			void rollZ(boolean isReverse) {
				if(!isReverse) roll(Face.FRONT, Face.LEFT, Face.BACK, Face.RIGHT);
				else roll(Face.FRONT, Face.RIGHT, Face.BACK, Face.LEFT);
			}
			
			private void roll(Face w, Face x, Face y, Face z) {
				T tmp = id[w.ordinal()];
				id[w.ordinal()] = id[x.ordinal()];
				id[x.ordinal()] = id[y.ordinal()];
				id[y.ordinal()] = id[z.ordinal()];
				id[z.ordinal()] = tmp;
			}
			
			@Override
			public boolean equals(Object o) {
				if(!(o instanceof Dice<?>))return false;
				@SuppressWarnings("unchecked")
				Dice<T> d = (Dice<T>)o;
				for(Face f : Face.values()){
					if(!id[f.ordinal()].equals(d.id[f.ordinal()])){
						return false;
					}
				}
				return true;
			}
			
			boolean isEquivalent(Dice<T> d) {
				for(int i=0; i<6; i++) {
					for(int j=0; j<4; j++) {
						if(this.equals(d)) return true;
						rollZ(false);
					}
					if(i%2==1) rollY(false);
					else rollX(false);
				}
				return false;
			}
			
			List<Dice<T>> getAllState(){
				List<Dice<T>> lst = new ArrayList<Dice<T>>();
				for(int i = 0; i < 6; i++){
					for(int j = 0; j < 4; j++){
						lst.add(new Dice<T>(id[Face.TOP.ordinal()], id[Face.BOTTOM.ordinal()], id[Face.FRONT.ordinal()], id[Face.BACK.ordinal()], id[Face.RIGHT.ordinal()], id[Face.LEFT.ordinal()]));
						rollZ(false);
					}
					if(i%2 == 1) rollY(false);
					else rollX(false);
				}
				return lst;
			}

			@Override
			public String toString() {
				String str = "";
				for(Face f : Face.values()){
					str += id[f.ordinal()] + " ";
				}
				return str;
			}

			@Override
			public int hashCode() {
				int hash = 31;
				for(Face f : Face.values()){
					hash += hash*17+id[f.ordinal()].hashCode();
				}
				return hash;
			}
	}



}