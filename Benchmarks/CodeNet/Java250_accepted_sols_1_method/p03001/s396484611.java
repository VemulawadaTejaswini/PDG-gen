import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			double w = sc.nextInt();
			double h = sc.nextInt();
			double x = sc.nextInt();
			double y = sc.nextInt();
			
			double area = w * h / 2;
			boolean check = false;
			
			if (w / 2 == x && h / 2 == y) {
				check = true;
			}
			
			if (check) {
				System.out.println(area + " " + 1);
			} else {
				System.out.println(area + " " + 0);
			}
		}

	}

}
