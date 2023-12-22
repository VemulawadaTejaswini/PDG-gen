import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		String[] d = new String[k];
		Arrays.setAll(d, i -> sc.next());
		
		int pay = n;
		outer:
		for (; pay < n * 100; pay++) {
			String s = String.valueOf(pay);
			for (int i = 0; i < k; i++) {
				if (s.contains(d[i])) continue outer;
			}
			break;
		}
		
		System.out.println(pay);
			
		sc.close();
	}
}

