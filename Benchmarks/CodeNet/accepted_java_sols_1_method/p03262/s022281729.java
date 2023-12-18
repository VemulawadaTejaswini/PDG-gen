import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int x[] = new int[n+1];


		for (int i=0;i<=n;++i){
			x[i]=sc.nextInt();
		}

	//	Arrays.sort(x);

		int common=Math.abs(x[1]-x[0]);
		int a;
		int b;
		int c;

		for (int i=1;i<n;++i){
			a=Math.max(Math.abs(x[i]-x[i-1]), Math.abs(x[i+1]-x[i]));
			b=Math.min(Math.abs(x[i]-x[i-1]), Math.abs(x[i+1]-x[i]));
			while ((c=a%b)!=0){
				a=b;
				b=c;
			}
			common = Math.min(common, b);
		}

		System.out.println(common);

	}
}