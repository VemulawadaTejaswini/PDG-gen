package SD;
import java.util.Scanner;
public class aoj0565 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner sc=new Scanner(System.in);
		int a,b,c,d,e;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();	
		int[] x={a,b,c};
		int [] y={d,e};
		for(int i=0;i<x.length/2;i++){
			for(int j=0;j<x.length;j++){
				if(x[j]<x[i]){
				int t=x[i];
				x[i]=x[j];
				x[j]=t;
				}	
			}
		}
		for(int i=0;i<y.length/2;i++){
			for(int j=0;j<y.length;j++){
				if(y[j]<y[i]){
					int s=y[i];
					y[i]=y[j];
					y[j]=s;
				}
			}
		}
		int A=x[0]+y[0]-50;
		System.out.println(A);
	}
}