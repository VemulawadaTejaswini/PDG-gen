import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		List<Character> ans = new ArrayList<>();
		
		char[] chas = s.toCharArray();
		
		for(int i=1, len=s.length(); i<len+1; i++ ) {
			if(i % 2 != 0) {
				ans.add(chas[i-1]);
			}
		}
		
		for(char item: ans) {
			System.out.print(item);
		}
		
		
		sc.close();
	}
}
