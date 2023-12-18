import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		int cnt = 0;
		for(int i = A; i <= B; i++) {
			String n = Integer.toString(i);
			boolean flag = true;
			for(int j = 0; j < n.length() / 2; j++) {
				char c1 = n.charAt(j);
				char c2 = n.charAt(n.length() - j - 1);
				if(c1 != c2) {
					flag = false;
					break;
				}
			}
			if(flag) cnt++;
		}
		System.out.println(cnt);
	}
}