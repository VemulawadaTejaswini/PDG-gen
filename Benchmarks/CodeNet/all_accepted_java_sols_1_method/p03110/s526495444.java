import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double ans=0;

		for(int i=0;i<n;i++) {
			double num = sc.nextDouble();
			String str = sc.next();
			if(str.equals("JPY")) {
				ans+=num;
			}else if(str.equals("BTC")) {
				ans+=num*380000.0;
			}
		}

		System.out.println(ans);

	}
}