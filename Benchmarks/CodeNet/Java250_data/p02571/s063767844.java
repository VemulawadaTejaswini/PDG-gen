import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		String t = scan.next();
		
		String[] s1 = s.split("");
		String[] t1 = t.split("");
		
		if(s1.length == t1.length) {
			int ans1 = s1.length;
			
			for(int i = 0; i < t1.length; i++) {
				
				if(s1[i].equals(t1[i])) {
					ans1--;
				}
			}
			
			System.out.print(ans1);
			return;
		}
		
		int[] ans = new int[s1.length-t1.length-1];
		
		for(int j = 1; j < s1.length-t1.length; j++) {
			
			String str = s.substring(j, j+t1.length);
			//System.out.println(str);
			String[] str1 = str.split("");
			
			ans[j-1] = t1.length;
			
			for(int i = 0; i < t1.length; i++) {
				
				if(str1[i].equals(t1[i])) {
					ans[j-1]--;
				}
			}
		}
		
		int sm = 10000000;
		
		for(int i = 0; i < ans.length; i++) {
			//System.out.println(ans[i]);
			if(ans[i] < sm) {
				sm = ans[i];
			}
		}
		
		System.out.print(sm);

	}

}