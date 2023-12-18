
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());//int型
		String sline = sc.next();
		sc.close();
		String[] s =new String[n];
		for (int i=0; i<n; i++){
			s[i] = String.valueOf(sline.charAt(i));
		}
		ArrayList<Integer> divind = new ArrayList<Integer>();
		
		for(int i=0; i<n-1; i++) {
			if (s[i].equals(".")&&s[i+1].equals("#")) { 
				divind.add(i);
			}
		}
		int cnt = 0;
		int[] sharps = new int[n]; // #の累積和
		int[] dots = new int[n];
		for (int i=0; i<n; i++){
			if (s[i].equals("#")) {
				cnt++;
			} 
			sharps[i] = cnt;
		}
		int ans = 10000000;
		int tmp = 10000000;
		
		cnt = 0;
		for (int i=n-1; i>-1; i--){
			if (s[i].equals(".")) {
				cnt++;
			} 
			dots[i] = cnt;
		}
		/*
		for (int i=0; i<n; i++){
			System.out.print(sharps[i]);
		}
		System.out.print("\n");
		for (int i=0; i<n; i++){
			System.out.print(dots[i]);
		}
		System.out.print("\n");
		*/
		for (int i=0; i<n-1; i++) {
			// System.out.println(in);
			tmp = sharps[i]+dots[i+1];
			ans = Math.min(tmp, ans);
		}
		ans = Math.min(ans, dots[0]);
		ans = Math.min(ans, sharps[n-1]);

		System.out.println(ans);
	}

}
