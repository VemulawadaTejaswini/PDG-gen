import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int maxL = 0;
		int lSum = 0;

		for(int i= 0; i < t; i++) {
			int l = sc.nextInt();
			if(l > maxL) {
				lSum += maxL;
				maxL = l;
			} else {
				lSum += l;
			}
		}

		if (maxL < lSum) {

			System.out.println("Yes");
		} else {
			System.out.println("No");

		}



	}

}
