import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		for (int i = 0; i < a.length; i++) {
			a[i]= sc.nextInt();
		}
		if (a[0] == a[1]&&a[1]==a[2]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
