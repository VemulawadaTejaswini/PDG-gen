import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		String str = sc.nextLine(), temp;
		int mini;
		boolean sStable = true;
		String[] A = str.split(" "), B = str.split(" ");
		for (int i = 0; i <= A.length - 1; i++) {
			for (int j = A.length - 1; j >= i + 1; j--) {
				if (Integer.parseInt(A[j].replaceAll("[\\D]", "")) < Integer
						.parseInt(A[j - 1].replaceAll("[\\D]", ""))) { // i should stop using java for these problems
					temp = A[j];
					A[j] = A[j - 1];
					A[j - 1] = temp;
				}
			}
		}
		for (int i=0; i<A.length-1;i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println(A[A.length-1]+"\nStable");
		for (int i = 0; i <= B.length - 1; i++) {
			mini = i;
			for (int j = i; j <= B.length - 1; j++) {
				if (Integer.parseInt(B[j].replaceAll("[\\D]", "")) < Integer
						.parseInt(B[mini].replaceAll("[\\D]", ""))) {
					mini = j;
				}
			}
			temp = B[i];
			B[i] = B[mini];
			B[mini] = temp;
		}
		for (int i = 0; i < B.length; i++) {
			sStable &= A[i].equals(B[i]);
		}
		for (int i = 0; i < B.length-1; i++) {
			System.out.print(B[i] + " ");
		}
		System.out.println(B[B.length-1]);
		if (sStable) {
			System.out.println("Stable");
		} else {
			System.out.println("Not stable");
		}
	}

}

