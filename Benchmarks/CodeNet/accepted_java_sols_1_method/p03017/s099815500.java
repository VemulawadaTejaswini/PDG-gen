import java.util.Scanner;

// https://atcoder.jp/contests/agc034/submissions/5769395
// https://atcoder.jp/contests/agc034/submissions/5749660

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner(System.in)) {
			int fieldSize = sc.nextInt(); // N
			int sNow = sc.nextInt() - 1; // A
			int hNow = sc.nextInt() - 1; // B 
			int sGoal = sc.nextInt() - 1; // C
			int hGoal = sc.nextInt() - 1; // D
			String s = sc.next();
			
			boolean q1 = s.substring(sNow, sGoal).contains("##");
			boolean q2 = s.substring(hNow,hGoal).contains("##");
			
			boolean res = false;
			res = !(q1 || q2);
			
			if (sGoal > hGoal) {
				/*
				 * 開始視点がH君よりうしろのS君のゴールが、H君より後ろにある場合、
				 * 追い抜く必要がある。
				 * 追い抜くには、H君のゴール地点の１つ後ろまでを含めte
				 * ”...”があれば、途中でH君を追い抜ける。
				 * 1. 　”.hGol.”
				 */
				res &= s.substring(hNow-1, hGoal+2).contains("...");
			}
			
			System.out.println(res ? "Yes" : "No");
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
