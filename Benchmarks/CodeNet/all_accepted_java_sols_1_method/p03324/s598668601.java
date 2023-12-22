import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int n = sc.nextInt();
		
		int ans;
		
		if(n<100) {
			ans = n * (int)Math.pow(100, d);
		}else {
			ans = (n+1) * (int)Math.pow(100,d);
		}
		
		System.out.println(ans);

		sc.close();
	}

}