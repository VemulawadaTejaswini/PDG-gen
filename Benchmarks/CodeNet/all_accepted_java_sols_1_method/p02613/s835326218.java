import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);

		 int n = s.nextInt();
		 String[] str = new String[n];
		 Map map = new HashMap();

		 for(int i=0; i<n; i++) {
			 str[i] = s.next();
		 }

		 map.put("AC", new Integer(0));
		 map.put("WA", new Integer(0));
		 map.put("TLE", new Integer(0));
		 map.put("RE", new Integer(0));

		 for(int i=0; i<n; i++) {
			 Integer tmp = (Integer)map.get(str[i]);
			 Integer val = tmp + 1;
			 map.put(str[i], val);
		 }

		 System.out.println("AC x " + (Integer)map.get("AC"));
		 System.out.println("WA x " + (Integer)map.get("WA"));
		 System.out.println("TLE x " + (Integer)map.get("TLE"));
		 System.out.println("RE x " + (Integer)map.get("RE"));
	}

}