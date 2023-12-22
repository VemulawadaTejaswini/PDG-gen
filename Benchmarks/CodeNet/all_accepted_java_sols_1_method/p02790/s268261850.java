import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int[] arrayA = new int[b];
		int[] arrayB = new int[a];
		String amozi = "";
		String bmozi = "";


		for(int i=0;i<b;i++) {
			arrayA[i] = a;
			amozi = amozi + String.valueOf(arrayA[i]);

		}

		for(int i=0;i<a;i++) {
			arrayB[i] = b;
			bmozi = bmozi + String.valueOf(arrayB[i]);
		}

		System.out.println(arrayA[0]>=arrayB[0]?bmozi:amozi);

		scan.close();

	}

}
