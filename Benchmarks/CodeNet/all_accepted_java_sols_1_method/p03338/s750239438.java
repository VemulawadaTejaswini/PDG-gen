import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		sc.close();
		
		int ans = 0;
		for(int i = 1;i < S.length();++i) {
			Set<Character> sufSet = new HashSet<>();
			for(int j = 0;j < i;++j)
				sufSet.add(S.charAt(j));
			Set<Character> preSet = new HashSet<>();
			for(int j = i;j < S.length();++j)
				preSet.add(S.charAt(j));
			Set<Character> set = new HashSet<>(sufSet);
			set.retainAll(preSet);
			if(set.size() > ans)
				ans = set.size();
		}
		System.out.println(ans);
	}
}
