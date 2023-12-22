import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int i = 1;
        int n;
        while ((n = sc.nextInt()) != 0) {
            System.out.println("Case " + i + ": " + n);
            i++;
        }
	}
}