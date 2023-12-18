import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String strArray[] = str.split(" ");
		int a = Integer.parseInt(strArray[0]);
		int b = Integer.parseInt(strArray[1]);
		int c = Integer.parseInt(strArray[2]);

		if (a < b) {// a<b
			if (b < c) {// a<b<c
				System.out.println(a + " " + b + " " + c);
			} else {
				if (a < c) {// a<c<b
					System.out.println(a + " " + c + " " + b);
				} else {// c<a<b
					System.out.println(c + " " + a + " " + b);
				}
			}
		} else {// b<a
			if (a < c) {// b<a<c
				System.out.println(b + " " + a + " " + c);
			} else {
				if (b < c) {// b<c<a
					System.out.println(b + " " + c + " " + a);
				} else {// c<b<a
					System.out.println(c + " " + b + " " + a);
				}
			}
		}
	}
}