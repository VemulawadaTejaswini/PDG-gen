import java.io.*;
public class Main {
	public static void main(String[] args) {
		try {
	        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(in.readLine());
	        String A = new String(in.readLine());
	        String B = new String(in.readLine());
	        String C = new String(in.readLine());
	        char[] charA = new char[n];
			char[] charB = new char[n];
			char[] charC = new char[n];
			charA = A.toCharArray();
			charB = B.toCharArray();
			charC = C.toCharArray();
			
			int ret = 0;
			for (int i = 0; i < n; i++) {
				if (charA[i] != charB[i] && charA[i] != charC[i] && charB[i] != charC[i] ) {
					ret = ret + 2;
				} else if (charA[i] != charC[i] || charA[i] != charB[i]) {
					ret++;
				}
			}
			System.out.println(String.valueOf(ret));

		} catch (Exception ex) {}
	}	
}