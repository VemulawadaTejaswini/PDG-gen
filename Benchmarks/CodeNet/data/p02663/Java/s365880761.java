
import java.util.*;
import java.io.*;

public class main {
	public static void main(String[] args) throws Exception {
		new main().print();
		return;
	}

	void print() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = (br.readLine()).trim().split(" ");
		int h1 = Integer.parseInt(str[0]);
		int m1 = Integer.parseInt(str[1]);
		int h2 = Integer.parseInt(str[2]);
		int m2 = Integer.parseInt(str[3]);
		int k = Integer.parseInt(str[4]);

		int tt = (h2 * 60 + m2) - (h1 * 60 + m1);
		System.out.println(tt - k);
	}
}
