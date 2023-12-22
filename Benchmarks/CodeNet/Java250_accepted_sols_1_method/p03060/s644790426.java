import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		List<String> vl = Arrays.asList(sc.nextLine().split(" "));

		List<String> cl = Arrays.asList(sc.nextLine().split(" "));

		int result = 0;

		for(int i=0; i<n;i++) {
			int v = Integer.parseInt(vl.get(i));
			int c = Integer.parseInt(cl.get(i));
			if(v-c>0) {
			result += (v-c);
			}
		}
		System.out.println(result);
	}
}