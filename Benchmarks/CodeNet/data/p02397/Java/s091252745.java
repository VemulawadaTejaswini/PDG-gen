import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int x;
        int y = 0;
        int temp;
        while ((x = sc.nextInt()) != 0 || (y = sc.nextInt()) != 0) {
            if (x > y) {
            	temp = x;
            	y = x;
            	x = temp;
            }
            System.out.println(x + " " + y);
        }
	}
}