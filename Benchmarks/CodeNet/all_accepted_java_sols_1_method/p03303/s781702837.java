import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		ArrayList<String> ss = new ArrayList<String>();

		String[] strs = str.split("");

		for(int i=0; i<strs.length; i++) {
			if(i%n == 0) {
				ss.add(strs[i]);
			}
		}

		String res = "";
		for(int i=0; i<ss.size(); i++) {
			res += ss.get(i);
		}

		System.out.println(res);
	}
}
