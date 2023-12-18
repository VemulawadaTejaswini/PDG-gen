import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;




public class Main {




	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);




	public static void main(String[] args) {
		TreeMap<String, ArrayList<Integer>> map = new TreeMap<String, ArrayList<Integer>>();
		while(scan.hasNext()){
			String mozi = scan.next();
			int page = si();
			if(!map.containsKey(mozi)){
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(page);
				map.put(mozi,list);
			}else{
				ArrayList<Integer> list = map.get(mozi);
				list.add(page);
				map.put(mozi,list);
			}
		}
		for(Entry<String, ArrayList<Integer>> e : map.entrySet()){
			out.println(e.getKey());
			ArrayList<Integer> list = e.getValue();
			Collections.sort(list);
			for (int i = 0; i < list.size() ; i++) {
				if(i==list.size()-1) out.println(list.get(i));
				else out.print(list.get(i)+" ");
			}
		}
		out.flush();
	}




	static int si() {
		return Integer.parseInt(scan.next());
	}
}