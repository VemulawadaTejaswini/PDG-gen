import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] words = sc.nextLine().split(" ");
		LinkedList<String> ans = new LinkedList<String>();
		for(String word: words) {
			word = word.replace(",", "").replace(".", "");
			if( 3<=word.length() && word.length() <= 6 ) ans.add(word);
		}
		for(;!ans.isEmpty();) {
			System.out.print( ans.remove() + (ans.isEmpty()? "\n": " ") );
		}
	}
}