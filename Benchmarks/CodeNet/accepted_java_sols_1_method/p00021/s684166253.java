import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i,t;
		double a1,a2,x[]=new double[6],y[]=new double[6];
		while(true){
			if(n<=0) break;
			for(i=0;i<4;i++){
				x[i]=s.nextDouble();
				y[i]=s.nextDouble();
			}
			x[4]=x[0]-x[1];
			x[5]=x[2]-x[3];
			y[4]=y[0]-y[1];
			y[5]=y[2]-y[3];
			a1=y[4]/x[4];
			a2=y[5]/x[5];
			if(a1==a2){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
			n--;
		}
	}

}