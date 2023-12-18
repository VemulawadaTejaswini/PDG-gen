import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int questionAllNo = sc.nextInt();
		int[] solveMin = new int[questionAllNo];
		for(int i = 0; i < questionAllNo; i++) {
			solveMin[i] = sc.nextInt();
		}
		int drinkNo = sc.nextInt();
		for (int i = 0; i < drinkNo; i++) {
			int ans = 0;
			int questionNo = sc.nextInt();
			int solveMinDrink = sc.nextInt();
			for (int j = 0; j < questionAllNo; j++) {
				if (j == questionNo-1) {
					ans+= solveMinDrink;
				} else {
					ans+= solveMin[j];
				}
			}
			System.out.println(ans);
		}
		sc.close();
	}
}