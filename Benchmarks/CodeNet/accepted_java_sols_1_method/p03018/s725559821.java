import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		// 「ABC → BCA」の置換はAとBCの交換とみなせるはず
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String base = br.readLine();
		base = base.replace("BC", "X");

		int cntA = 0;
		long answer = 0;
		
		char[] targ = base.toCharArray();
		for ( int i = 0; i < targ.length; i++ ) {
			if ( targ[i] == 'A' ) cntA++;
			else if ( targ[i] == 'X' ) answer += cntA;
			else cntA = 0;
		}

		System.out.println(answer);
		br.close();
	}
}