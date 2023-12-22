import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int outlet = 1;
		int sum = 0;
		while(outlet < B) {
			outlet = outlet + A - 1;
			sum ++;
		}
		System.out.println(sum);
	}
}
