import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int d1 = x2 - x1;
        int d2 = y2 - y1;

        System.out.println((x2 - d2) + " " + (y2 + d1) + " " + (x1 - d2) + " " + (y1 + d1));

	}

}
