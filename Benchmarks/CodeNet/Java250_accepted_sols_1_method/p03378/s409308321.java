import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 文字列の入力
		String s1 = sc.nextLine();

		String[] sr1 = s1.split(" ");
		
		int n = Integer.parseInt(sr1[0]);
		int m = Integer.parseInt(sr1[1]);
		int x = Integer.parseInt(sr1[2]);

		String s2 = sc.nextLine();

		String[] sr2 = s2.split(" ");

		int count1 = 0;
		for(int i = x; i<=n; i++) {
			for(int j = 0; j<m; j++) {
				if(i == Integer.parseInt(sr2[j])) count1++;
			}
		}

		int count2 = 0;
		for(int i = x; i>=0; i--) {
			for(int j = 0; j<m; j++) {
				if(i == Integer.parseInt(sr2[j])) count2++;
			}
		}

		if(count1 <= count2) {
			// 出力
			System.out.println(count1);
		} else {
			// 出力
			System.out.println(count2);
		}
	}
}