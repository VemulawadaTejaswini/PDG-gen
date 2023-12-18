import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] a = in.readLine().split(" ");
		short A = Short.valueOf(a[0]); short B = Short.valueOf(a[1]);
		short total = 0;
		for(int i = 0; i < 2; i++) {
			if(A > B) {
				total += A;
				A--;
			}else {
				total += B;
				B--;
			}
		}
		System.out.println(total);
	}
}
