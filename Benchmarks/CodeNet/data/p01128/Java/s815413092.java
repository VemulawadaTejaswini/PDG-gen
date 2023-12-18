import java.awt.geom.Line2D;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	static int x1, y1, x2, y2,N;
	static final double EPS = 1e-8;
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		for(int Test=cin.nextInt();Test--!=0;){
			x1=cin.nextInt();
			y1=cin.nextInt();
			x2=cin.nextInt();
			y2=cin.nextInt();
			N=cin.nextInt();
			Line[] line=new Line[N];
			double[][] p = new double[N][2];
			for(int i=0;i<N;i++){
				line[i]=new Line(cin.nextInt(),
						cin.nextInt(),
						cin.nextInt(),
						cin.nextInt(),
						cin.nextInt(),
						cin.nextInt());
				line[i].p=p[i];
			}

			for(int i=0;i<N;i++){
				if(!Line2D.linesIntersect(x1,y1,x2,y2, line[i].x1,line[i].y1,line[i].x2,line[i].y2
				)){
					p[i][0]=1<<30;
					line[i].isCross=false;
					continue;
				}

				p[i]=crossPointSS(
						new double[]{x1,y1},
						new double[]{x2,y2},
						new double[]{line[i].x1,line[i].y1},
						new double[]{line[i].x2,line[i].y2}

				);
				line[i].p=p[i];
				//				System.out.println(p[i][0]+" "+p[i][1]);
			}/*
			Arrays.sort(p,new Comparator<double[]>(){
				public int compare(double[] a,double[] b){
					if(a[0]-b[0]<EPS)return 0;
					if(a[0]+EPS>b[0])return 1;
					return -1;
				}
			});*/
			for(int i=0;i<N;i++){
				//				System.out.println(line[i]+" "+line[i].p[0]+" "+line[i].x2);
			}
			Arrays.sort(line);
//			System.out.println();
			for(int i=0;i<N;i++){
//				System.out.println(line[i].isMine+" "+line[i].isHigh);
			}
			//			System.out.println();
			boolean isHigh=false;
			int c=0;
			for(int i=0;i<N;i++){
				if(!line[i].isCross)continue;

				if(line[i].isMine){
					isHigh=line[i].isHigh;
				}
				else{
					isHigh=!line[i].isHigh;
				}
				c=i;
				break;
			}
//			System.out.println(isHigh);
			int ans=0;
			for(int i=0;i<N;i++){
				if(!line[i].isCross)continue;
				if(c==i)continue;
				if(line[i].isMine){
					if(line[i].isHigh==isHigh){
						
					}
					else{
						isHigh=line[i].isHigh;
						ans++;
					}
				}
				else{
					if(line[i].isMine==isHigh){
						isHigh=!line[i].isHigh;
						ans++;
					}
				}
//				System.out.println(isHigh);
			}
			System.out.println(ans);

		}
	}

	static class Line implements Comparable<Line>{
		int x1, y1, x2, y2;
		boolean isMine, isHigh,isCross;
		double[] p;
		Line(int a,int b,int c,int d,int e,int f){
			x1=a;
			y1=b;
			x2=c;
			y2=d;
			isMine=e==1;
			isHigh=f==1;
			isCross=true;
		}
		public int compareTo(Line line){
			if(p[0]-line.p[0]<EPS)return 0;
			if(p[0]+EPS>line.p[0])return 1;
			return -1;
		}
	}
	static double[] crossPointSS(double[] a1, double[] a2, double[] b1, double[] b2){
		if(!intersectSS(a1, a2, b1, b2))return null;
		double[] b = sub(b2, b1);
		double d1 = Math.abs(cross(b, sub(a1, b1)));
		double d2 = Math.abs(cross(b, sub(a2, b1)));
		double t = d1/(d1+d2);
		double[] a = sub(a2, a1);
		return new double[]{a1[0]+a[0]*t, a1[1]+a[1]*t};
	}
	static boolean intersectSS(double[] a1, double[] a2, double[] b1, double[] b2){
		return cross(sub(a2, a1), sub(b1, a1))*cross(sub(a2, a1), sub(b2, a1)) < EPS &&
		cross(sub(b2, b1), sub(a1, b1))*cross(sub(b2, b1), sub(a2, b1)) < EPS;
	}
	static double norm(double[] a){
		return Math.hypot(a[0], a[1]);
	}
	static double[] sub(double[] a, double[] b){
		return new double[]{a[0]-b[0], a[1]-b[1]};
	}
	static double dot(double[] a, double[] b){
		return a[0]*b[0]+a[1]*b[1];
	}
	static double cross(double[] a, double[] b){
		return a[0]*b[1]-a[1]*b[0];
	}



}