import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		TreeMap<String, ArrayList<Integer>> paged = new TreeMap<String, ArrayList<Integer>>();
		while (sc.hasNext()) {
			String line = sc.nextLine();
			String[] data = line.split(" ");
			
			if (paged.containsKey(data[0])) {
				paged.get(data[0]).add(Integer.parseInt(data[1]));
			} else {
				ArrayList<Integer> al = new ArrayList<Integer>();
				al.add(Integer.parseInt(data[1]));
				
				paged.put(data[0], al);
			}
		}
		
		for (String key : paged.keySet()) {
			System.out.println(key);
			
			ArrayList<Integer> al = paged.get(key);
			Collections.sort(al);
			for (int i = 0; i < al.size(); i++) {
				System.out.print(al.get(i));
				if (i < (al.size() - 1)) System.out.print(" ");
			}
			System.out.println();
		}
	}
}