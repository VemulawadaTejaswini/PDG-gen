import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String[] r = new String[n];
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			int p = sc.nextInt();
			r[i] = s + "_" + (1100 - p) + "_" + (i + 1);
		}
		
		Arrays.sort(r);
		
		for (String str : r) {
			System.out.println(str.split("_")[2]);
		}

		sc.close();
	}
	
}


