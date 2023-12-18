import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String input = sc.next();
		
		if(n%2==1) {
			System.out.println("No");
			return;
		}
		
		for(int i = 0; i < n/2; i++) {
			if(input.charAt(i)!=input.charAt(n/2+i)) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}