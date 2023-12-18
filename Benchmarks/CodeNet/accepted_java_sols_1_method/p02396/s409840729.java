import java.util.Scanner;
public class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int x, i = 0;
		while(true) {
			x = sc.nextInt();
			if(x == 0) break;
			i++;
			System.out.println("Case " + i + ": " + x);
		}
	}
}

