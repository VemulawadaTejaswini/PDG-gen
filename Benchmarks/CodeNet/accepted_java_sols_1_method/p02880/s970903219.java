import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean isPoss = false;
		int number = input.nextInt();
		for (int i=1;i<10;i++) {
			for (int j=1;j<10;j++) {
				if (i*j == number) {
					isPoss = true;
				}
			}
		}
		if (isPoss) {
			System.out.println("Yes");
		}else {
			System.out.print("No");
		}
    }
}
