import java.util.Scanner;
import java.util.HashMap;
 
class Main {
	public static void main(String[] args) {
 
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    String S = "";
	    Integer count = 0;
	    HashMap<String, Integer> map = new HashMap<>();
	    
	    for (int i = 1; i <= N ; i++) {
	      S = sc.next();
	      count = map.get(S);
	      if (count == null) count = 1; else count++;
	      map.put(S, count);
	    }
	    
	    Integer AC = map.get("AC"); if (AC == null) AC = 0;
	    Integer WA = map.get("WA"); if (WA == null) WA = 0;
	    Integer TLE = map.get("TLE"); if (TLE == null) TLE = 0;
	    Integer RE = map.get("RE"); if (RE == null) RE = 0;
	    
	    System.out.println("AC x " + AC);
	    System.out.println("WA x " + WA);
	    System.out.println("TLE x " + TLE);
	    System.out.println("RE x " + RE);
  }
}