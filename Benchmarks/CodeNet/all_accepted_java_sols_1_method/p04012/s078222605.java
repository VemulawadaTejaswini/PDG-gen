import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		List<Integer> alf = new ArrayList<Integer>();
		for(int i=0;i<26;i++) {
			alf.add(0);
		}
		for(int i=0;i<s.length();i++) {
	//		System.out.println(s.charAt(i));
			int a = (int)s.charAt(i);
	//		System.out.println(a);
			alf.set(a-97, alf.get(a-97)+1);
		}
	//	System.out.println(alf);
		String ans = "Yes";
		for(int i=0;i<26;i++) {
			if(alf.get(i)%2!=0) {
				ans = "No";
			}
		}
		System.out.println(ans);
	}

}