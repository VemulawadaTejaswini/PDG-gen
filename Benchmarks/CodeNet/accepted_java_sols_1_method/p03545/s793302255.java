import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] line = sc.nextLine().toCharArray();
		int n = line.length;
		int[] s = new int[n];
		String ans = "";
		for(int i = 0;i < n;i++) s[i] = line[i] - '0';
		
		// 探索
		long sum = s[0];
		int op = 0;
		for(int i = 0;i < (1 << n - 1);i++) {
			sum = s[0];
			op = i;
			for(int j = 0;j < n - 1;j++) {
				if((i >> j & 1) != 1) {
					sum -= s[j + 1];
				}
				else {
					sum += s[j + 1];
				}
			}

			if(sum == 7) {
				break;
			}
		}

		// 結果の出力
		for(int i = 0;i < n;i++) {
			ans += s[i];
			if((op >> i & 1) == 1 && i != n - 1) {
				ans += "+";
			}
			else if(i != n - 1){
				ans += "-";
			}
		}
		
		ans += "=7";
		System.out.println(ans);		
    }
}