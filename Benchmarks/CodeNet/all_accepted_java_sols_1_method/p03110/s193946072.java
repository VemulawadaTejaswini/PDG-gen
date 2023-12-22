import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		double x,ans=0;
		for(int i = 0;i<n;i++) {
			x=scn.nextDouble();
			if(scn.next().equals("JPY")) {
				ans+=x;
			}else {
				ans+=x*380000;
			}
		}
		System.out.println(ans);
		scn.close();
	}
}