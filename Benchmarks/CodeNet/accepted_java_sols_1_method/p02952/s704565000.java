import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		   int n = sc.nextInt();
		   int order = 0;
		   int m = n;
		   int ans = 0;

		   while(m>=1) {
			   m = m/10;
			   order += 1;
		   }
		   if(order%2==0) {
			   for(int i=1;i<=order-1;i=i+2) {
				   ans = ans + (int)Math.pow(10, i)-(int)Math.pow(10, i-1);
			   }
		   }else {
			   for(int i=1;i<=order-2;i=i+2) {
				   ans = ans + (int)Math.pow(10, i)-(int)Math.pow(10, i-1);
			   }
			   ans = ans + (n-(int)Math.pow(10, order-1)+1);
		   }
		   System.out.println(ans);

		    sc.close();
	}
}