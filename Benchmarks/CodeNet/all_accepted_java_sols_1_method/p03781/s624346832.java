import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = Integer.parseInt(sc.next());

		for(int i = 1; i <= X; i++) {
			if(i * (i+1) / 2 >= X) {
				System.out.println(i);
				break;
			}
		sc.close();
		}
	}
}
