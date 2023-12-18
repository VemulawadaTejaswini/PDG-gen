import java.util.Scanner;
class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n=sc.nextInt();
		double ans=0;
		for(int i=0;i<n;i++) {
			double x= sc.nextDouble();
			String s=sc.next();
			if(s.equals("BTC"))x*=380000;
			ans+=x;
		}
		System.out.println(ans);
		}
}




