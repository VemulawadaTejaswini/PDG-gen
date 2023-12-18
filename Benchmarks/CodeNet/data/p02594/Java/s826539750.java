import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		if(A >= 30) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

