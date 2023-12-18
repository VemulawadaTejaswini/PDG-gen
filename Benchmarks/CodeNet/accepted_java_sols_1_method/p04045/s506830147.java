import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//nedan
		int k = sc.nextInt();//kosuu
		int num[] = new int[k];
		int ord;
		int ordnum;
		int ans = n;
		boolean flg = true;
		for (int i = 0; i < k; i++) {
			num[i] = sc.nextInt();
		}
		for (int i = n; i <= 99999; i++) {
			flg = true;
			ord = Integer.toString(i).length();
			for (int j = 0; j < ord; j++) {
				ordnum = i % (int) (Math.pow(10, (j + 1))) / (int) (Math.pow(10, j));
				for (int l = 0; l < k; l++) {
					if (ordnum == num[l]) {
						flg = false;
						break;
					}
				}
				if (flg == false) {
					break;
				}
			}
			if (flg == true) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}

}