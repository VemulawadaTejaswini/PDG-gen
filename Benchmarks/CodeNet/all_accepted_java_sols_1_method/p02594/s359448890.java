import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		if(X >= 30) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
	}
}