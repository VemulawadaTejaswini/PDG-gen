import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<Integer> ans = new HashSet<>();
		for(int i=0;i<n;i++) {
			ans.add(sc.nextInt());
		}
		System.out.println(ans.size());
	}

}