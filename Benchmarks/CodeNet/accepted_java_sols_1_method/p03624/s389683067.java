
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] Alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		String S = scan.next();
		List<String> SList = new ArrayList<String>();
		for(int i = 0; i < S.length(); i++) {
			SList.add(S.substring(i, i + 1));
		}
		List<String> SHashList = new ArrayList<String>(new HashSet<String>(SList));
		if(SHashList.size() == 26) {
			System.out.println("None");
		} else {
			for(int i = 0; i < Alpha.length; i++) {
				if(S.indexOf(Alpha[i]) == -1) {
					System.out.println(Alpha[i]);
					break;
				}
			}
		}
		scan.close();

	}

}
