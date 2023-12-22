import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int empNum = sc.nextInt();
		int[] rel = new int[empNum - 1];

		for (int i=0;i<rel.length;i++) {
			rel[i] = 0;
		}

		for(int i=0;i<rel.length;i++) {
			rel[sc.nextInt()-1]++;
		}

		for (int i = 0; i < rel.length; i++) {
			System.out.println(rel[i]);
		}
		System.out.println("0");


		sc.close();
	}
}