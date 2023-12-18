import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = null;
		Map<String, List<Integer>> index = new TreeMap<String, List<Integer>>();
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			while( stdIn.hasNext() ){
				String[] s = stdIn.nextLine().split(" ");
				if( !index.containsKey(s[0]) ){
					List<Integer> list = new ArrayList<Integer>();
					list.add(Integer.parseInt(s[1]));
					index.put(s[0], list);
				} else {
					index.get(s[0]).add(Integer.parseInt(s[1]));
					index.put(s[0], index.get(s[0]));
				}
			}
			
			for(String str : index.keySet()){
				System.out.println(str);
				Collections.sort(index.get(str));
				for(int i = 0; i < index.get(str).size()-1; i++){
					System.out.print(index.get(str).get(i) + " ");
				}
				System.out.println(index.get(str).get(index.get(str).size()-1));
				
			}
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}