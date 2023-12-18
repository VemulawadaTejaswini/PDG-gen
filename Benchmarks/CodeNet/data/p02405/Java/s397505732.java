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
                System.out.println(line);
	    }
	    //lines.add("1 1");
	    //lines.add("0 0");
	    br.close();

/**
	    for (Integer i = 0; i < lines.size(); i++) {
		String[] splits = lines.get(i).split(" ");

                System.out.println(lines.get(i));

		Integer H = Integer.parseInt(splits[0]);
		Integer W = Integer.parseInt(splits[1]);
		if (H==0&&W==0) {
		    System.exit(0);
		}
		System.out.println(String.format("H = %d, W = %d", H, W));

		for (int h = 0; h < H; h++) {
		    char[] chars = new char[W];
		    Arrays.fill(chars, '#');
		    String line = new String(chars);
		    StringBuilder sharps = new StringBuilder(line);
		    for (int j = 0; j < line.length(); j++) {
			if ( (h%2==0&&j%2==0) || (h%2==1&&j%2==1) ) {
			    sharps.setCharAt(j, '.');
			}
		    }
		    System.out.println(sharps.toString());
		}
	    }
*/
	    System.exit(0);

	} catch (Exception e) {
	    System.out.println(e.getMessage());
	    System.out.println(Arrays.toString(e.getStackTrace()));
	    System.exit(0);
	}
    }
}