import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		sc.close();
		
		if(Math.abs(A - B) < 2) {
			System.out.println("Yay!");
		}else {
			System.out.println(":(");
		}
	}
}