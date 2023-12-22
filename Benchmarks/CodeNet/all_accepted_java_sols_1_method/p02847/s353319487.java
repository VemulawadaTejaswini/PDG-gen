import java.util.HashMap;
import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		
		HashMap<String, Integer> day = new HashMap<String, Integer>();
		day.put("SUN",7);
		day.put("MON",6);
		day.put("TUE",5);
		day.put("WED",4);
		day.put("THU",3);
		day.put("FRI",2);
		day.put("SAT",1);

		Scanner sc = new Scanner(System.in);
		System.out.println(day.get(sc.next()));
	}
}
