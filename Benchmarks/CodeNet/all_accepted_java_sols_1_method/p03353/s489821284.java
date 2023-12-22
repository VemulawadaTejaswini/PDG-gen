import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int K = sc.nextInt();
		
		TreeSet<String> S = new TreeSet<>();
		TreeSet<String> T = new TreeSet<>();
		
		String[] t = s.split("");
		for(String i : t) {
			T.add(i);
		}
		
		for(String i : T) {
			int x = s.indexOf(i);
			int y = 0;
			while(x != -1) {
				for(int j = x; j < s.length(); j++) {
					if(j + 1 - x > K) {
						break;
					}
					S.add(s.substring(x, j + 1));
				}
				y++;
				x = s.indexOf(i, y);
			}
			if(S.size() >= K) {
				break;
			}
		}
		
		int a = 0;
		
		for(String i : S) {
			a++;
			if(a == K) {
				System.out.println(i);
			}
		}
	}
}
