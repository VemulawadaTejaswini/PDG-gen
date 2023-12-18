import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		char c[] = sc.next().toCharArray();
		boolean bl = true;
		if(k >= c.length) {
			k = c.length;
			bl = false;
		}
		for(int i = 0; i < k; i++) {
			System.out.print(c[i]);
		}
		if(bl)
			System.out.println("...");
	}

}
