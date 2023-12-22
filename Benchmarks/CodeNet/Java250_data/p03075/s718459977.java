import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] an = new int[5];
		for(int i = 0; i < 5; i++) {
			an[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		String ans = ":(";
		sc.close();
		if (an[4] - an[0] <= k) {
			ans = "Yay!";
		}
		System.out.println(ans);
	}
}