import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		int t = sc.nextInt();
		
		int total = 0;
		int res = 0;
		
		while(total < n) {
			
			res += t;
			total += x;
		}
		
		System.out.println(res);
		
		sc.close();
	}

}
