import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt(),l=scan.nextInt();
		ArrayList<String> dict = new ArrayList<String>();
		for(int i=0; i<n; i++) {
			dict.add(scan.next());
		}
		Collections.sort(dict);
		String result="";
		for(int i=0; i<n; i++) {
			result+=dict.get(i);
		}
		System.out.println(result);
 	}

}