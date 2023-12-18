import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main{

    static StringBuilder sb;

    public static void main(String[] args) {
	try {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    List<String> lines = new ArrayList<String>();

	    for (String line = br.readLine(); line != null; line = br.readLine()) {
		lines.add(line);
	    }
	    br.close();

	    //lines.add("3 4");
	    //lines.add("1 2 0 1");
	    //lines.add("0 3 0 1");
	    //lines.add("4 1 1 0");
	    //lines.add("1");
	    //lines.add("2");
	    //lines.add("3");
	    //lines.add("0");

	    String[] index = lines.get(0).split(" ");
	    Integer n = Integer.parseInt(index[0]);
	    Integer m = Integer.parseInt(index[1]);

	    Integer[][] A = new Integer[n][m];
	    Integer[][] b = new Integer[1][m];

	    for (int i = 0; i < n; i++) {
		String[] vector = lines.get(1+i).split(" ");
		for (int j = 0; j < m; j++) {
		    A[i][j] = Integer.parseInt(vector[j]);
		}
	    }
	    for (int i = 0; i < m; i++) {
		b[0][i] = Integer.parseInt( lines.get(1+n+i) );
	    }

	    // ?????? A * b
	    Integer[][] ans = new Integer[1][n];
	    for (int i = 0; i < n; i++) {
		ans[0][i] = 0;
		for (int j = 0; j < n; j++) {
		    //System.out.println(String.format("b[0][%d] = %d, A[%d][%d] = %d", i, b[0][n],i,j,A[i][j]));
		    ans[0][i] += b[0][j] * A[i][j];
		}
	    }

	    for (int i = 0; i < n; i++) {
		System.out.println(ans[0][i]);
	    }

	    System.exit(0);

	} catch (Exception e) {
	    System.out.println(e.getMessage());
	    System.out.println(Arrays.toString(e.getStackTrace()));
	    System.exit(0);
	}
    }
}