import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	int value(List<Integer> list) {
		int v = 0;
		for (int i : list)
			v = v*10 + i;
		return v;
	}
	
	void run() {
		String a;
		int l;
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> save = new ArrayList<Integer>();
		while (true) {
			a = sc.next(); l = sc.nextInt();
			if (a.equals("0") && l == 0) break;
			
			save.clear();
			save.add(Integer.parseInt(a));
			while (true) {
				list.clear();
				for (int i = 0; i < a.length(); i++)
					list.add(Character.getNumericValue(a.charAt(i)));
				for (int i = 0; i < l-a.length(); i++)
					list.add(0);
				
				int temp1, temp2;
				Collections.sort(list);
				temp1 = value(list);
				Collections.reverse(list);
				temp2 = value(list);
				int v = temp2-temp1;
				if (save.contains(v)) {
					out.printf("%d %d %d\n", save.indexOf(v), v, save.size()-save.indexOf(v));
					break;
				} else {
					save.add(v);
					a = String.valueOf(v);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}