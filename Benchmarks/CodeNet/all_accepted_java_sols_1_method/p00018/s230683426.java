import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args){
		ArrayList<Integer>	list 	= new ArrayList<Integer>();
		String[] lineStr = null;
		StringBuilder sb = new StringBuilder();
		String s;
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
		try {
			lineStr = br.readLine().split(" ");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(int i=0; i<lineStr.length; i++){
			list.add(Integer.parseInt(lineStr[i]));
		}
		
		Collections.sort(list);
		Collections.reverse(list);
		
		for(int i=0; i<list.size(); i++){
			sb.append(list.get(i) + " ");
		}
		s = sb.toString();
		System.out.println(s.trim());
		
		
	}
}