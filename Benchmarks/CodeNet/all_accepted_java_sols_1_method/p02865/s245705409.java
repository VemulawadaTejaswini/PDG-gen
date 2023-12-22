import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (1 <= i && i <= 1000000) {
			if (i % 2 == 0) {
				i = i / 2 - 1;
			} else {
				i = (i - 1) / 2;
			}
		}
        System.out.println(i);
		sc.close();
	}
}
