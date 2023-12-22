import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    String line = br.readLine();
	    int n = Integer.parseInt(line);

	    int tarouScore = 0;
	    int hanakoScore = 0;
	    for (int i = 0; i < n; i++) {
	    	String[]s = br.readLine().split(" ");
			String tarou = s[0];
			String hanako = s[1];

			ArrayList<String> dic = new ArrayList<String>();
			dic.add(tarou);
			dic.add(hanako);

			Collections.sort(dic);

			if (tarou.equals(hanako)) {
				tarouScore += 1;
				hanakoScore += 1;
			} else if (tarou.equals(dic.get(0))) {
				hanakoScore += 3;
			} else {
				tarouScore += 3;
			}
	    }
	    System.out.println(tarouScore + " " + hanakoScore);
	}
}