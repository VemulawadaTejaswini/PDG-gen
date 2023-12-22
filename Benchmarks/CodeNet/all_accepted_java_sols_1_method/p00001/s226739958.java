import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	public static void main (String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<Integer>();
		String line;
		while((line = br.readLine()) != null){
			
			list.add(Integer.parseInt(line));
		}
		Collections.sort(list);
		Collections.reverse(list);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
	}
}