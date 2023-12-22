import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		List<String> s = new ArrayList<String>();
		for(int i=0;i<n;i++) {
			s.add(sc.next());
		}
		Collections.sort(s);
	//	System.out.println(s);
		String ans = "";
		for(int i=0;i<n;i++) {
			ans += s.get(i);
		}
		System.out.println(ans);
	}

}