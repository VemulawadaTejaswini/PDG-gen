import java.util.Scanner;

public class Main {
	public static Scanner sc;
	public static void main(String[] args){
		sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x[]=new int[n];
		int y[]=new int[n];
		for(int i=0;i<n;i++){
			x[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			y[i]=sc.nextInt();
		}
		Double d1=0.0,sum2=0.0,sum3=0.0,d4=0.0;
		for(int i=0;i<n;i++){
			d1+=Math.abs(x[i]-y[i]);
			sum2+=(x[i]-y[i])*(x[i]-y[i]);
			sum3+=(x[i]-y[i])*(x[i]-y[i])*(x[i]-y[i]);
			d4=Math.max(d4,Math.abs(x[i]-y[i]));
		}
		System.out.println(d1);
		System.out.println(Math.sqrt(sum2));
		System.out.println(Math.cbrt(sum3));
		System.out.println(d4);
	}

}