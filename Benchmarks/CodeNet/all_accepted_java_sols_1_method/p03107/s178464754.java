import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		long zeroCount = 0;
		long oneCount = 0;

		long count = 0;
		for (char c : s.toCharArray()) {
			if(c=='0') {
				zeroCount++;
			} else {
				oneCount++;
			}

			if(zeroCount > 0 && oneCount > 0) {
				count++;
				zeroCount--;
				oneCount--;
			}
		}

		System.out.println(count*2);
	}

}
