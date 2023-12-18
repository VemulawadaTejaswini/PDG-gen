import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n % 2 ==1) {
			System.out.println("No");
		}else {
			char[] s = sc.next().toCharArray();
			boolean flag = true;
			for (int i = 0; i < n/2; i++) {
				if(s[i] != s[i+n/2]) {
					flag = false;
					break;
				}
			}
			System.out.println(flag ? "Yes":"No");
		}
		sc.close();
	}
}