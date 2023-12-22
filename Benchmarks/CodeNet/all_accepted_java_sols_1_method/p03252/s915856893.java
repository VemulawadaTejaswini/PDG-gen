import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] s = br.readLine().split("");
		String[] t = br.readLine().split("");
		
		
		boolean flag = true;
		
		
		ArrayList<String> S = new ArrayList<>();
		ArrayList<String> T = new ArrayList<>();
		
		
		for (int i = 0; i < s.length && flag; i++) {
			if (!S.contains(s[i])) {
				S.add(s[i]);
			}
			s[i] = Integer.toString(S.indexOf(s[i]));
			if (!T.contains(t[i])) {
				T.add(t[i]);
			}
			t[i] = Integer.toString(T.indexOf(t[i]));
			if (!s[i].equals(t[i]))
				flag = false;
		}

		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
