import java.io.*;
import java.util.*;
public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> mountains = new ArrayList<Integer>();
		int i = 0;
		while(true){
			String s = r.readLine();
			mountains.add(Integer.valueOf(s));
			if(++i == 10) break;
		}
		Collections.sort(mountains);
		Collections.reverse(mountains);
		i = 0;
		for(int m : mountains) {
			System.out.println(m);
			if(++i >= 3) break;
		}
	}
}