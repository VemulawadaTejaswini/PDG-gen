import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] inputs = scanner.nextLine().split(" ", 0);
		int A = Integer.parseInt(inputs[0]);
		int B = Integer.parseInt(inputs[1]);
		if(A <= 5) {
			System.out.println("0");
		}else if(A <= 12) {
			System.out.println(B / 2);
		}else{
			System.out.println(B);
		}
	}
}