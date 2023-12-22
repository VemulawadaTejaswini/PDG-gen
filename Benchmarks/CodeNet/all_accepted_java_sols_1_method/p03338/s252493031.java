import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		
		int max = 0;
		for (int i = 1; i < n - 1; i++) {
			String x = s.substring(0, i);
			String y = s.substring(i);
			
			int cnt = 0;
			for (char c = 'a'; c <= 'z'; c++) {
				String key = String.valueOf(c);
				if (x.contains(key) && y.contains(key)) cnt++;
			}
			
			max = Math.max(max, cnt);
		}
		
		System.out.println(max);
		
		sc.close();
	}
}


