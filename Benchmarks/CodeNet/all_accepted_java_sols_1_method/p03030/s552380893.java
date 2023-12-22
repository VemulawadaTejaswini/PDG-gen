import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	/* ABC128 B
	 *
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] strs = new String[n];
		
		for (int i = 0; i < n; i++) {
			strs[i] = sc.next() + "_" + (1100-sc.nextInt()) + "_" + (i+1);
		}
		sc.close();
		
		Arrays.sort(strs);
		
		for (String s : strs) {
			System.out.println(s.split("_")[2]);
		}
		
	}

}