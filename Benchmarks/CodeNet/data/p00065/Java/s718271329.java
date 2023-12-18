import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		TreeMap<Integer,Integer> map = new TreeMap<>();
		int a;
		
		while (true) {
			String[] temp = sc.next().split(",");
			if (temp[0].equals("")) {break;}
			a = Integer.parseInt(temp[0]);
			map.put(a,map.getOrDefault(a,1));
		}
		
		
		while (sc.hasNext()) {
			String[] temp = sc.next().split(",");
			a = Integer.parseInt(temp[0]);
			map.put(a,map.get(a)+1);
		}
		
		for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
			if (entry.getValue() >= 2) {out.println(entry.getKey()+" "+entry.getValue());}
		}
	}
}
