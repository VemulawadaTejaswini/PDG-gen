import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		 int N = scan.nextInt();
		 int[] d = new int[N];
		 
		 for (int i = 0; i < N; i++) {
			 d[i] = scan.nextInt();
		 }
		 
		 Arrays.sort(d);
		 
		 int same_d = 0;
		 for (int j = 0; j < N-1; j++) {
			 if (d[j] == d[j + 1]) {
				 same_d += 1; 
			 }
		 }
		 
		 System.out.println(N - same_d);
		 
		 scan.close();
		 
	}

}
