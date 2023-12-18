import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 1;
		
		while (n != 0/*sc.hasNextInt()*/) {
			n = sc.nextInt();
			System.out.println((n * n + n + 2) / 2);
		}
	}
}