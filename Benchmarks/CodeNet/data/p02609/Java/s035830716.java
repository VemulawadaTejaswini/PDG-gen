import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] x = sc.next().split("");
		for (int i = 0; i < n; i++) {
			String[] target = new String[x.length];
			String tmp = null;
		 // 置き換え
			if (x[i].equals("0")) {
				tmp = "1";
			} else {
				tmp = "0";
			}
			for (int j = 0; j < x.length; j++) {
				if (i == j) {
						target[j] = tmp;
				} else {
					if (x[j].equals("0")) {
						target[j] = "0";
					} else {
						target[j] = "1"; 
					}
				}
			}
			// 置き換え完了。target を検討
			int popcount = getPopCount(target);
			int targetInt = getTarget(target);
			for (int c = 1; ; c++) {
				int nextTarget = divide(popcount, targetInt);
				if (nextTarget == 0) {
					System.out.println(c);
					break;
				}
				targetInt = nextTarget;
				String t = Integer.toBinaryString(targetInt);
				popcount = getPopCount(t.split(""));
			}
		}
	}
	
	private static int divide(int popcount, int target) {
		if (popcount == 0 || target == 0) {
			return 0;
		}
		return target % popcount;
	}
	
	private static int getPopCount(String[] target) {
		int popcount = 0;
		for (int j = 0; j < target.length; j++) {
				if (target[j].equals("1")) {
					popcount++;
				}
		}
		return popcount;
	}
	
	private static int getTarget(String[]  target) {
		String s = String.join("", target);
		return Integer.parseInt(s, 2);
	}
}
