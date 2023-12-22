import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		
		long r = s.replaceAll("[^R]", "").length();
		long g = s.replaceAll("[^G]", "").length();
		long b = s.replaceAll("[^B]", "").length();
		
		long cnt = r * g * b;
		
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1 ; j < n - 1; j++) {
				int k = j + (j - i);
				if (k >= n) continue;
				if (s.charAt(i) != s.charAt(j)
					&& s.charAt(j) != s.charAt(k)
					&& s.charAt(k) != s.charAt(i))
					cnt--;
			}
		}
		
		System.out.println(cnt);
		
		sc.close();
	}
}

