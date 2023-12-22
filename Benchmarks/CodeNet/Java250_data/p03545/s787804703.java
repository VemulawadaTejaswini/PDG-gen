import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int num[] = new int[4];
		for(int i = 0; i < 4; i++) {
			num[i] = Integer.parseInt(str.substring(i, i + 1));
		}
		
		int ans_ary[] = new int[4];
		ans_ary[0] = num[0];
		
		for(int i = 0; i < Math.pow(2, 3); i++) {
			int ans = num[0];
			for(int j = 0; j < 3; j++) {
				if((1 & i >> j) == 1) {
					ans += num[j + 1];
					ans_ary[j + 1] = num[j + 1];
				} else {
					ans -= num[j + 1];
					ans_ary[j + 1] = -num[j + 1];
				}
			}
			if(ans == 7) {
				break;
			}
		}
		
		String ans_str = String.valueOf(ans_ary[0]);
		for(int i = 0; i < 3; i++) {
			if(ans_ary[i + 1] >= 0) {
				ans_str += "+" + String.valueOf(ans_ary[i + 1]);
			} else {
				ans_str += String.valueOf(ans_ary[i + 1]);
			}
		}
		
		System.out.println(ans_str + "=7");
	}
}