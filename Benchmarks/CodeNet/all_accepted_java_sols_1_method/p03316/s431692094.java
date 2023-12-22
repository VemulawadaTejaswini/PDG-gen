import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int temp = n;
		while(temp != 0) {
			sum += temp % 10;
			temp /= 10;
		}
		if(n % sum == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}