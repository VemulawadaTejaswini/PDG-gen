import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		int LEN = S.length()/2;
		
		int ans = 0;
		for(int i=LEN-1; i>0; i--) {
			if (S.substring(0, i).contentEquals(S.substring(i, 2*i))) {
				ans = 2 * i;
				break;
			}
		}
		System.out.println(ans);	
	}
}