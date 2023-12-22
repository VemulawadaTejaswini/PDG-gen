import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
				int x = sc.nextInt();
				int y = sc.nextInt();

				int area = x * y;
				int circum = (2*x + 2*y);
				System.out.print(area);
				System.out.print(" ");
				System.out.print(circum);
				System.out.print('\n');
    }
}