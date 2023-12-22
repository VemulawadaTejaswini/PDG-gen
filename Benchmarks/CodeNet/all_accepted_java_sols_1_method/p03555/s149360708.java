import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] a = sc.next().toCharArray();
		char[] b= sc.next().toCharArray();
		for(int i = 0; i < 3; i++) {
			if(a[2-i] != b[i]) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
