import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		sc.close();
		int L = A + B;
		int R = C + D;
		if(R == L) {
			System.out.println("Balanced");
		}else if(R > L) {
			System.out.println("Right");
		}else {
			System.out.println("Left");
		}
	}
}