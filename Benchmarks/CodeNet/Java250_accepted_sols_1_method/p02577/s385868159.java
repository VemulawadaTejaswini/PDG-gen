import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int sum = 0;
		for(int i = 0; i < N.length(); i++) {
			sum += N.charAt(i)-'0';
		}
		if(sum % 9 == 0) {
			System.out.print("Yes");
		}else if(sum == 0){
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
	}
}
