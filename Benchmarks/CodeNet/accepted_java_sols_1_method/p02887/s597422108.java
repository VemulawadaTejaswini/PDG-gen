import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s = sc.next();
		int total = n;
		
		if(n == 1) {
			System.out.println(1);
			return;
		}
		
		for(int i = 0; i <= n - 3; i++) {
			if(s.substring(i, i+1).equals(s.substring(i+1, i+2))){
				total--;
			}
		}
		
		if(s.substring(n-2, n-1).equals(s.substring(n-1))){
			total--;
		}
		
		System.out.println(total);
		

	}
}
