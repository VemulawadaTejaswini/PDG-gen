import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = Integer.parseInt(sc.next());
		int input2 = Integer.parseInt(sc.next());
		System.out.print(input1*input2);
		sc.close();
	}
}