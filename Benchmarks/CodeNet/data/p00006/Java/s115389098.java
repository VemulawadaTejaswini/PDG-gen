import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayDeque<String> ans = new ArrayDeque<String>();

		while(sc.hasNext()){
			String s = sc.next();
			StringBuffer t = new StringBuffer(s);
			t.reverse();
			ans.push(t.toString());
		}
		int num = ans.size();
		for(int i=0;i<num;i++){
			System.out.println(ans.pollLast());
		}
	}
}