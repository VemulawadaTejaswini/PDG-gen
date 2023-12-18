import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//int n = sc.nextInt();
		//String s = sc.next();
		//long n = sc.nextLong();
		//double n = sc.nextDouble();
		int ans = 0;
		for(int i = 0; i < 5 ; i++) {
			int n = sc.nextInt();
			if(n == 0) {
				ans = i+1;
			}
		}

	
		System.out.println(ans);
		//System.out.println("No");
		

	}
}
