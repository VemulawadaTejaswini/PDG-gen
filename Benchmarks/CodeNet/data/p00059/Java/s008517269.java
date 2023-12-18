import java.util.Scanner;
public class Main {
	static double x1[]=new double[2];
	static double y1[]=new double[2];
	static double x2[]=new double[2];
	static double y2[]=new double[2];
	public static boolean check(double x,double y) {
		if(x1[0]<=x && x<=x1[1] && y1[0]<=y && y<=y1[1]){
			return true;
		}
		return false;
	}
	public static boolean check2(double x,double y) {
		if(x2[0]<=x && x<=x2[1] && y2[0]<=y && y<=y2[1]){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double tmp;
		int i,j;
		while(sc.hasNext()){
			for(i=0;i<2;i++){
				x1[i]=sc.nextDouble();
				y1[i]=sc.nextDouble();
			}
			for(i=0;i<2;i++){
				x2[i]=sc.nextDouble();
				y2[i]=sc.nextDouble();
			}
			if(x1[1]<x1[0]){
				tmp=x1[1];
				x1[0]=x1[1];
				x1[1]=tmp;
			}
			if(y1[1]<y1[0]){
				tmp=y1[1];
				y1[0]=y1[1];
				y1[1]=tmp;
			}
			if(x2[1]<x2[0]){
				tmp=x2[1];
				x2[0]=x2[1];
				x2[1]=tmp;
			}
			if(y2[1]<y2[0]){
				tmp=y2[1];
				y2[0]=y2[1];
				y2[1]=tmp;
			}
			boolean f=false;
			for(i=0;i<2;i++){
				for(j=0;j<2;j++){
					//System.out.println(f+" "+x2[i]+" "+y2[j]);
					if(f) break;
					f=check(x2[i],y2[j]);
				}
			}//
			for(i=0;i<2;i++){
				for(j=0;j<2;j++){
					//System.out.println(f);
					if(f) break;
					f=check2(x1[i],y1[j]);
				}
			}//
			if(f){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
}