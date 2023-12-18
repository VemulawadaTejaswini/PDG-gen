import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			String com = br.readLine();
			if (com.charAt(0) == 'i')
				insertKey(list, Integer.parseInt(com.substring(7)));
			else {
				if (com.charAt(6) == ' ')
					deleteKey(list, Integer.parseInt(com.substring(7)));
				else if (com.charAt(6) == 'F')
					deleteFirstMember(list);
				else
					deleteLastMember(list);
			}
		}
		
		int m = list.size();
		for (int i = 0; i < m; i++) {
			if (i !=m - 1)
				System.out.print(list.get(i) +" ");
			else 
				System.out.println(list.get(i));
		}
	}
	
	public static void insertKey(ArrayList<Integer> l, int x) {
		l.add(0, x);
	}
	
	public static void deleteKey(ArrayList<Integer> l, int x) {
		int xat = l.indexOf(x);
		if (xat != -1)
			l.remove(xat);
	}
	
	public static void deleteFirstMember(ArrayList<Integer> l) {
		l.remove(0);
	}
	
	public static void deleteLastMember(ArrayList<Integer> l) {
		l.remove(l.size() - 1);
	}
}