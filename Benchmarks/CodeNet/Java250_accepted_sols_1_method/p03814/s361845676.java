import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int ans = 0;
		for(int i=0;i<s.length();i++) {
			String a = s.substring(i,i+1);
			if(a.equals("A")) {
	//			System.out.println(i);
				ans += i;
				break;
			}
		}
		for(int i=s.length()-1;i>=0;i--) {
			String z = s.substring(i,i+1);
			if(z.equals("Z")) {
	//			System.out.println(i);
				ans -= i;
				break;
			}
		}
		System.out.println(-ans+1);
	}

}