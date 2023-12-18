import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("Sunny", "Cloudy");
		hm.put("Cloudy", "Rainy");
		hm.put("Rainy", "Sunny");
		System.out.println(hm.get(sc.next()));
	}
}