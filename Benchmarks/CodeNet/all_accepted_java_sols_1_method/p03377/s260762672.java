import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int X = Integer.parseInt(sc.next());
		sc.close();
		if(A <= X && X <= A + B) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}
}
