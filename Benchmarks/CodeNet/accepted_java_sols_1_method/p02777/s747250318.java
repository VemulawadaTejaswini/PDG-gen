import java.util.Scanner;

class Main {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		String S = scanner.next();
		String T = scanner.next();
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		String U = scanner.next();

		scanner.close();;

		if (U.equals(S)) {
			A--;
		} else if (U.equals(T)) {
			B--;
		}
		System.out.println(A + " " + B);
	}
}