import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int x = 0;
		int max = x;
		for (int i = 0; i < n; i++) {
			if("I".equals(s.substring(i, i+1))) {
				x++;
				if (max < x) {
					max = x;
				}
			} else {
				x--;
			}
		}
		System.out.println(max);
		sc.close();
	}
}
