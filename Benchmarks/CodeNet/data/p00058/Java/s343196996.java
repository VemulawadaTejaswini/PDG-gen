import java.util.Scanner;

public class Orthogonal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double x[]=new double[4];
		double y[]=new double[4];
		double xab,yab,xcd,ycd,ns;
		int i;
		while(sc.hasNext()){
			for(i=0;i<4;i++){
				x[i]=sc.nextDouble();
				y[i]=sc.nextDouble();
			}
			xab=x[1]-x[0];
			yab=y[1]-y[0];
			xcd=x[3]-x[2];
			ycd=y[3]-y[2];
			ns=(xab*xcd)+(yab*ycd);
			if(ns==0){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}//while
	}
}