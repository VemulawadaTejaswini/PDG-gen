import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		List<Integer> l = new ArrayList<Integer>();
		List<Integer> check = new ArrayList<Integer>();
		for(int i=0;i<3;i++) {
			l.add(sc.nextInt());
		}
		check.add(5);
		check.add(5);
		check.add(7);
		Collections.sort(l);
		Collections.sort(check);
	//	System.out.println(l);
	//	System.out.println(check);
		String ans = "NO";
		if(l.get(0)==check.get(0)) {
			if(l.get(1)==check.get(1)) {
				if(l.get(2)==check.get(2)) {
					ans = "YES";
				}
			}
		}
		System.out.println(ans);
	}
}