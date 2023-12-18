import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String strArray[] = br.readLine().split(" ");
	int n = Integer.parseInt(strArray[0]);
	int m = Integer.parseInt(strArray[1]);
	long k = Integer.parseInt(strArray[2]);
	strArray = br.readLine().split(" ");
	List<Long> a = new ArrayList<Long>();
	for (String s : strArray) {
	    a.add(Long.parseLong(s));
	}
	strArray = br.readLine().split(" ");
	List<Long> b = new ArrayList<Long>();
	for (String s : strArray) {
	    b.add(Long.parseLong(s));
	}

	int count = 0;
	while (k > 0) {
	    Long shorter = 0l;
	    if (a.size() > 0 && b.size() > 0) {
		if (a.get(0) < b.get(0)) {
		    shorter = a.get(0);
		    a.remove(0);
		} else {
		    shorter = b.get(0);
		    b.remove(0);
		}
	    } else if (a.size() > 0) {
		shorter = a.get(0);
		a.remove(0);
	    } else if (b.size() > 0) {
		shorter = b.get(0);
		b.remove(0);
	    } else {
		k = 0;
	    }
	    k -= shorter;
	    if (k >= 0) {
		count++;
	    }
	}
	System.out.println(count);
    }
}