import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		
		Set<Character> set = new HashSet<>();
		for(int i = 0;i < s.length();++i)
			set.add(s.charAt(i));
		
		if(set.size() == 26)
			System.out.println("None");
		else
			for(int i = 0;i < 26;++i)
				if(!set.contains((char)('a' + i))) {
					System.out.println((char)('a' + i));
					break;
				}
	}
}
