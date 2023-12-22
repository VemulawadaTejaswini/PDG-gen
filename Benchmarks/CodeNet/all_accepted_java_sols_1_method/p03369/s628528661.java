import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		int sum = 700;
		
		if(S.charAt(0) == 'o') {
			sum += 100;
		}
		if(S.charAt(1) == 'o') {
			sum += 100;
		}
		if(S.charAt(2) == 'o') {
			sum += 100;
		}
		System.out.println(sum);
		
	}
}
