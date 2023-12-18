import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		for(int i = 0 ; i < x + 1 ; i++) {
			if(y == i * 2 + (x - i) * 4) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}


}

