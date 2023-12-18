import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main{
    public static void main(String[] args) throws IOException {

	BufferedReader br = null;

	try {
	    br = new BufferedReader(new InputStreamReader(System.in));
	    List<String> lines = new ArrayList<String>();

	    for (String line = br.readLine(); line != null; line = br.readLine()) {
		lines.add(line);
	    }

	    String[] splits = lines.get(1).split(" ");
	    List<Integer> array = new ArrayList<Integer>();

	    for (String e : splits) {
		array.add(Integer.parseInt(e));
	    }

	    array.sort(Comparator.naturalOrder());

	    StringBuilder sb = new StringBuilder();
	    for (Integer e : array) {
	    	sb.append(String.valueOf(e));
		sb.append(" ");
	    }

	    String r = sb.toString();
	    r = r.substring(0, r.length()-1);

	    System.out.print(r);
	    System.exit(0);

	} catch (Exception e) {
	    System.out.println(e.getMessage());
	    System.out.println(Arrays.toString(e.getStackTrace()));
	    System.exit(0);
	} finally {
	    br.close();
	}
    }
}