import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String t = sc.next();
		String[] s1 = s.split("");
		String[] t1 = t.split("");
		
		int ans = 0;
		
		for(int i = 0; i < s1.length; i++) {
			if(s1[i].equals(t1[i])) {
				
			}else {
				ans++;
			}
		}
		
		System.out.print(ans);
	}

}
