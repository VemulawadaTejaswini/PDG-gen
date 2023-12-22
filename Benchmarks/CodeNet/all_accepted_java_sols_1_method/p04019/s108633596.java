import java.io.*;
import java.util.Set;
import java.util.TreeSet;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String s = in.readLine();
		Set<Character> a  = new TreeSet<>();
		for (int i = 0; i < s.length(); i++) {
			a.add(s.charAt(i));
			if(a.size() == 4) break;
		}
		
		int x = 0;
		int y = 0;
		if(a.contains('N')) x++;
		if(a.contains('S')) x++;
		if(a.contains('W')) y++;
		if(a.contains('E')) y++;
		
		if(x % 2 == 0 && y % 2 == 0) System.out.println("Yes");
		else System.out.println("No");

	}
}
