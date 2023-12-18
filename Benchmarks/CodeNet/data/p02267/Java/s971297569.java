import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = Integer.parseInt(in.next());
		String[] nArray = new String[n];
		
		for(int i = 0; i < n; i++) {
			String nString = in.next();
			nArray[i] = nString;
		}
		
		int q = Integer.parseInt(in.next());
		String[] qArray = new String[q];
		
		for(int j = 0; j < q; j++) {
			String qString = in.next();
			qArray[j] = qString;
		}
		
		int qCount = 0;
		for(String qStr : qArray) {
			for(String nStr : nArray) {
				if (nStr.matches(qStr)) {
					qCount++;
					break;
				}
			}
		}
		System.out.println(qCount);
		in.close();
	}
}

