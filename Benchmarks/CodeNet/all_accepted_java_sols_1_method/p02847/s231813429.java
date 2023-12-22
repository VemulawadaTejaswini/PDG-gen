import java.util.HashMap;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		HashMap<String, Integer> map = new HashMap<>();
		map.put("SAT", 1);
		map.put("FRI", 2);
		map.put("THU", 3);
		map.put("WED", 4);
		map.put("TUE", 5);
		map.put("MON", 6);
		map.put("SUN", 7);
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println(map.get(s));
	}
}
