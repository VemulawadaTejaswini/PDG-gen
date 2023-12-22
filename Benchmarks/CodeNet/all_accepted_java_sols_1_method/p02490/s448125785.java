import java.io.*;
import java.util.*;
class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (a == 0 && b == 0) break;
			list1.add(a);
			list2.add(b);
		}
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i) > list2.get(i) ? 
				list2.get(i) + " " + list1.get(i) : 
				list1.get(i) + " " + list2.get(i));
		}
	}
	
}