import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
	final Map<Character, Integer> map = new HashMap<Character, Integer>();
	map.put(Character.valueOf('I'), Integer.valueOf(1));
	map.put(Character.valueOf('V'), Integer.valueOf(5));
	map.put(Character.valueOf('X'), Integer.valueOf(10));
	map.put(Character.valueOf('L'), Integer.valueOf(50));
	map.put(Character.valueOf('C'), Integer.valueOf(100));
	map.put(Character.valueOf('D'), Integer.valueOf(500));
	map.put(Character.valueOf('M'), Integer.valueOf(1000));
	Scanner in = new Scanner(System.in);
	while (in.hasNext()) {
	 char[] q = in.next().toCharArray();
	 int val = 0;
	 int pre = 0;
	 for (int i = q.length - 1; i >= 0; i--) {
		int cVal = map.get(Character.valueOf(q[i])).intValue();
		if (cVal >= pre) {
		 val += cVal;
		} else {
		 val -= cVal;
		}
		pre = cVal;
	 }
	 System.out.println(val);
	}
 }
}