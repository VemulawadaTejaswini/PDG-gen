import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		HashMap<String , Integer> hm = new HashMap<>();
		hm.put("AC", 0);
		hm.put("WA", 0);
		hm.put("TLE", 0);
		hm.put("RE", 0);
		while(n-->0) {
			String input = sc.next();
			hm.put(input, hm.get(input)+1);
		}
		
		for(Map.Entry<String, Integer> entry:hm.entrySet()) {
			System.out.println(entry.getKey()+ " x " +entry.getValue());
		}
	}

}
