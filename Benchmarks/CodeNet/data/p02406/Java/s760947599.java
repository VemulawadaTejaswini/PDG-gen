import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// void call(int n){
//   int i = 1;
//  CHECK_NUM:
//   int x = i;
//   if ( x % 3 == 0 ){
//     cout << " " << i;
//     goto END_CHECK_NUM;
//   }
//  INCLUDE3:
//   if ( x % 10 == 3 ){
//     cout << " " << i;
//     goto END_CHECK_NUM;
//   }
//   x /= 10;
//   if ( x ) goto INCLUDE3;
//  END_CHECK_NUM:
//   if ( ++i <= n ) goto CHECK_NUM;
//
//   cout << endl;
// }

public class Main{

    private static void recursiveFoolJob(Integer i, Integer n, Integer x) {
	x = i;

	//System.out.println(String.format("i=%d,x=%d", i, x));
	if ( x % 3 == 0 ) {
	    sb.append(" " + i);
	    deadEnd(i,n,x);
	} else {
	    recursiveBadJob(i,n,x);
	}
    }

    private static void recursiveBadJob(Integer i, Integer n, Integer x) {

	//System.out.println(String.format("i=%d,x=%d", i, x));
	if ( x % 10 == 3 ) {
	    sb.append(" " + i);
	    deadEnd(i,n,x);
	} else {
	    x = x / 10;
	    if (x==1) {
		recursiveBadJob(i,n,x);
	    } else {
		deadEnd(i,n,x);
	    }
	}
    }

    private static void deadEnd(Integer i, Integer n, Integer x) {

	//System.out.println(String.format("i=%d,x=%d", i, x));
	if (i++ < n) {
	    recursiveFoolJob(i, n, x);
	} else {
	    System.out.println(sb.toString());
	    System.exit(0);
	}
    }

    // ????´???¨
    static StringBuilder sb;

    public static void main(String[] args) {
	try {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    List<String> lines = new ArrayList<String>();

	    for (String line = br.readLine(); line != null; line = br.readLine()) {
		lines.add(line);
	    }
	    //lines.add("60");
	    br.close();

	    Integer n = Integer.parseInt(lines.get(0));
	    Integer i = 1;
	    sb = new StringBuilder();

	    //System.out.println(String.format("n=%d", n));
	    recursiveFoolJob(i, n, i);

	    System.exit(0);

	} catch (Exception e) {
	    System.out.println(e.getMessage());
	    System.out.println(Arrays.toString(e.getStackTrace()));
	    System.exit(0);
	}
    }
}