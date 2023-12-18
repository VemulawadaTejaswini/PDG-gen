
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int[] pst = new int[3];
		int[] drk = new int[2];
				for (int i = 0; i < 3; i++) {
					pst[i] = sc.nextInt();
				}
				
				for (int i = 0; i < 2; i++) {
					drk[i] = sc.nextInt();
				}
		
		Arrays.sort(pst);
		Arrays.sort(drk);
		
		System.out.println(pst[0] + drk[0] - 50);
	}

}

