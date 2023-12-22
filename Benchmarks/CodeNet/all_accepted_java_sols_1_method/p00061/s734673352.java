import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String s;
		String[] temp = new String[2];
		HashMap<Integer,Integer> map = new HashMap<>();
		ArrayList<Integer> key = new ArrayList<>();
		int a,b;
		
		while (true) {
			s = sc.next();
			if (s.equals("0,0")) {break;}
			temp = s.split(",");
			a = Integer.parseInt(temp[0]);
			b = Integer.parseInt(temp[1]);
			
			map.put(a,b);
			if (!key.contains(b)) {key.add(b);}
		}
		
		int n;
		key.sort(Comparator.reverseOrder());
		
		while (sc.hasNext()) {
			out.println(key.indexOf(map.get(sc.nextInt()))+1);
		}
	}
}
