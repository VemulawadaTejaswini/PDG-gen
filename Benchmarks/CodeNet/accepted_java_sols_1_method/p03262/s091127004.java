import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int X = in.nextInt();
		int x[]=new int[N];
		int c[]=new int[N];

		
		for(int i=0;i<N;i++) {
			x[i]=in.nextInt();
			c[i]=x[i]-X;
		}
		int min=Math.abs(c[0]);
		int temp;
		int b=Math.abs(c[0]);
		int a;
		for(int i=1;i<N;i++) {
			a=c[i];
			  while((temp=a%b)!=0){
				    a = b;
				    b = temp;
				  }

			min=Math.abs(Math.min(min, b));
		}
		
		System.out.println(min);

	}
}