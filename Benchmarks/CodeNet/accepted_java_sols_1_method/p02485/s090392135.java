import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
	try {
	    BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
	    ArrayList<Integer> outlist = new ArrayList<Integer>();
	    String line = null;
	    while (true) {
		line = stdReader.readLine();
		if (line.equals("0")) {
		    break;
		}
		char[] in = line.toCharArray();
		int out = 0;
		for (int i = 0; i < line.length(); i++) {
		    out += Integer.parseInt("" + in[i]);
		}
		outlist.add(out);
	    }
	    for (int i = 0; i < outlist.size(); i++) {
		System.out.println(outlist.get(i));
	    }
	} catch (Exception e) {
	    System.out.println(e);
	    System.exit(-1);
	}
    }
}