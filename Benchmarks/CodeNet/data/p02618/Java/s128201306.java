import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int D 	  = Integer.parseInt(scanner.nextLine());
		int ans   = 0;
		int point = 0;

		String[] clist = scanner.nextLine().split(" ");
		int[] clis = new int[26];
		int[] list = new int[26 * D];

		for(int i = 0; i < 26 ; i++)clis[i] = Integer.parseInt(clist[i]);

		for(int i = 0; i < D; i++) {

			String[] slist = scanner.nextLine().split(" ");
			int count = i * 26;

			for(int j = 0; j < 26; j++) {

				list[count] = Integer.parseInt(slist[j]);
				count++;

			}
		}//1373

		int[] day = new int[26];
		for(int i = 0; i < 26; i++) day[i] = 0;


		for(int i = 0; i < D;i++) {

			int kai = i * 26;
			int max = list[kai];
			int t   = 0;


			for(int j = 0; j < 26; j++) {

				max = Math.max(max, list[kai + j]);

				if(max == list[kai + j]) {
					t = j + 1;
				}
			}
			/**
			point = i * 26 + t;

			ans += list[point];
			day[t] = i + 1;
			for(int j = 0; j < 26; j++) {

				ans -= clis[j] * (i + 1 - day[j]);

			}
			**/
			System.out.println(t);
		}
	}
}