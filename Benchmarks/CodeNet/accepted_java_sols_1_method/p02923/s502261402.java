import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());

		String[] temp = sc.nextLine().split(" ");
		int[] list = new int[n];
		int count = 0;
		int ans = 0;

		for(int i = 0; i < n; i ++) {

			list[i] = Integer.parseInt(temp[i]);

		}

		for(int i = 0; i < n; i ++) {

			int j = i;

				while(j + 1 < n && list[j] >= list[j + 1]) {

					count++;
					j++;

				}

			ans = Math.max(count, ans);
			count = 0;
			i = j;
			
		}

		System.out.println(ans);

	}

}
