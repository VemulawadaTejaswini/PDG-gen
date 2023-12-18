

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int x =Integer.parseInt(br.readLine());

		int h = x/3600;
		int m = x/60%60;
		int s = x%60;

		System.out.println(h+":"+m+":"+s);







	}

}

