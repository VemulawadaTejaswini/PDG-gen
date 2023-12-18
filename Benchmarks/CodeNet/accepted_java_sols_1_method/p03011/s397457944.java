import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P = sc.nextInt();
		int Q = sc.nextInt();
		int R = sc.nextInt();
		
		int[] i = {P,Q,R};
		Arrays.sort(i);
		System.out.println(i[0] + i[1]);
		
		sc.close();
		
	}

}
