import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int t = sc.nextInt();
		
		int res = 0;
		
		for(int i = a; i <= t+0.5; i+=a) {
			res+=b;
		}
		System.out.println(res);
	}

}
