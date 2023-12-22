import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		sc.close();
		int check = A * B;
		if(check == 2) {
			System.out.println(3);
		}else if(check == 3) {
			System.out.println(2);
		}else {
			System.out.println(1);
		}
	}
}