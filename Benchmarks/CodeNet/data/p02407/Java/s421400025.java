import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main{
    public static void main(String[] args) {
	try {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    List<String> lines = new ArrayList<String>();

	    for (String line = br.readLine(); line != null; line = br.readLine()) {
		lines.add(line);
	    }
	    br.close();

	    String[] splits = lines.get(1).split(" ");
	    StringBuilder sb = new StringBuilder();
	    for (int i = splits.length; i > 0; i--) {
		sb.append(splits[i]);
		if (i!=0)
		    sb.append(" ");
	    }

	    System.out.println(sb.toString());
	    System.exit(0);

	} catch (Exception e) {
	    System.out.println(e.getMessage());
	    System.out.println(Arrays.toString(e.getStackTrace()));
	    System.exit(0);
	}
    }
}