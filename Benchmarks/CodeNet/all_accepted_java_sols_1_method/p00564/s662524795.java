import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int a = in.nextInt();
	int x = (((n % a == 0) ? 0 : 1) + (n / a)) * in.nextInt();
	int c = in.nextInt();
	int y = (((n % c == 0) ? 0 : 1) + (n / c)) * in.nextInt();
	System.out.println(Math.min(x, y));
    }
}

