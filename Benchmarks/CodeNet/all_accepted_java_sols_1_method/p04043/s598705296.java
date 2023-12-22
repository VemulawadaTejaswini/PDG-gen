import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] in = new int[3];
		for(int i = 0; i < 3; i++) {
			in[i] = sc.nextInt();
		}

		Arrays.sort(in);
		
		if(in[0] == 5 && in[1] == 5 && in[2] == 7) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
