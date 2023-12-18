import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		TreeSet<Integer> a = new TreeSet<Integer>();
		
		String s;
		while((s = br.readLine()) != null)
				a.add(Integer.parseInt(s));

		System.out.println(a.pollLast());
		System.out.println(a.pollLast());
		System.out.println(a.pollLast());
		
	}
}