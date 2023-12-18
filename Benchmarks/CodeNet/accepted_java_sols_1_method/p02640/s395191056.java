import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		for (int i=0; i*2 <= y; i++){
			int tempY = y;
			tempY -= i*2;
			if (tempY == 4*(x-i)){
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}

}