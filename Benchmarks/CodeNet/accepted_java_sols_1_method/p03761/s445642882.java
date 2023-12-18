import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) { //WOOOOOOO AtCoder is HELPING!!!!!!!!!!
		Scanner input = new Scanner(System.in);
		String ans = "";
		int N = input.nextInt();
		int[] cnts = new int[300]; //Encapsulating all possible characters to prevent debugging
		String first = input.next();
		for (int i = 0; i < first.length(); i++) {
			char letter = first.charAt(i);
			cnts[(int)(letter)]++;
		}
		for (int i = 1; i < N; i++) {
			String x = input.next();
			int[] cur = new int[300];
			for (int j = 0; j < x.length(); j++) {
				char letter = x.charAt(j);
				cur[(int)(letter)]++;
			}
			for (int j = 0; j < cur.length; j++) {
				cnts[j]=Math.min(cnts[j], cur[j]);
			}
		}
		for (int i = 0; i < cnts.length; i++) {
			for (int j = 0; j < cnts[i]; j++) {
				char cur = (char)(i);
				String curans = Character.toString(cur);
				ans+=curans;
			}
		}
		System.out.println(ans);
	}
}