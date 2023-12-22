import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();
		int cntMax = 0;

		for (int i = 1; i < n; i++){
			String left = s.substring(0, i);
			String right = s.substring(i, s.length());
			HashSet<String> commonStr = new HashSet<String>();
			int cnt = 0;
			for (int j = 0; j < left.length(); j++){
				if (right.contains(left.substring(j, j+1))){
					commonStr.add(left.substring(j, j+1));
				}
			}
			cntMax = Math.max(cntMax, commonStr.size());
		}
		System.out.println(cntMax);
	}
}
