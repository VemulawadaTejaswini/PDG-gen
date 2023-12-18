import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	 	Scanner scanner = new Scanner(System.in);
	 	String S = scanner.next();
	 	int N = S.length();
	 	int count = 0;
		String[] splitArray = S.split("");
		String[] splitArray1 = new String[N];
		String[] A1 = new String[N/2];
		String[] A2 = new String[N/2];
		String[] B1 = new String[N/2];
		String[] B2 = new String[N/2];

		for (int i = 0; i < N; i++) {
			splitArray1[N-1-i] = splitArray[i];
		}

		for (int i = 0; i < N/2; i++) {
			A1[i] = splitArray[i];
		}

		for (int i = 0; i < N/2; i++) {
			A2[i] = A1[N/2-1-i];
		}

		for (int i = 0; i < N/2; i++) {
			B1[i] = splitArray1[i];
		}

		for (int i = 0; i < N/2; i++) {
			B2[i] = B1[N/2-1-i];
		}

		for (int i = 0; i < N; i++) {
			if (splitArray[i].equals(splitArray1[i])) {
				count += 0;
			} else {
				/*
				System.out.println("最初");
			    System.out.println(i);
			    System.out.println(splitArray[i]);
			    System.out.println(splitArray1[i]);
			    */
				count += 1;
				break;
			}
		}

		for (int i = 0; i < N/2; i++) {
			if (A1[i].equals(A2[i])) {
				count += 0;
			} else {
				/*
				System.out.println("A");
			    System.out.println(i);
			    System.out.println(A1[i]);
			    System.out.println(A2[i]);
			    */
				count += 1;
				break;
			}
		}

		for (int i = 0; i < N/2; i++) {
			if (B1[i].equals(B2[i])) {
				count += 0;
			} else {
				/*
				System.out.println("B");
			    System.out.println(i);
			    System.out.println(B1[i]);
			    System.out.println(B2[i]);
			    */
				count += 1;
				break;
			}
		}

		if (count != 0) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
 	}
}