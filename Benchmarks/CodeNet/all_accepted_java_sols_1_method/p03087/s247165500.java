import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		int[] countAC = new int[n];

		for (int i = 1; i < countAC.length; i++) {
			if (String.valueOf(s.charAt(i)).equals("C") && String.valueOf(s.charAt(i - 1)).equals("A")) {
				countAC[i] = countAC[i-1] + 1;

			} else {
				countAC[i] = countAC[i-1];
			}
			//System.out.println("count"+i +"="+ countAC[i]);
		}

		//01234567
		//ACACTACG
		//01122233
		for (int i = 0; i < q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int ans = countAC[r - 1] - countAC[l-1];
			System.out.println(ans);
		}
	}
}

