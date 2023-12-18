import java.util.Scanner;
import java.util.TreeSet;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next(); int K = sc.nextInt();
		TreeSet<String> ans = new TreeSet<String>();
		for(int k = 1; k <= K; k++) {
			for(int i = 0; i + k <= s.length(); i++) {
				ans.add(s.substring(i, i + k));
			}
		}
		while(K > 1) {
			ans.pollFirst();
			K--;
		}
		System.out.println(ans.pollFirst());
	}
}