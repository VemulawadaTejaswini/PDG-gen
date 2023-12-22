import java.util.Scanner;
import java.util.HashMap;
 
class Main {
	public static void main(String[] args) {
 
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    HashMap<Integer, Integer> map = new HashMap<>();
	    for (int i = 1; i < N; i++) {
	      int temp = sc.nextInt();
	      Integer count = map.get(temp);
	      if (count == null) { count = 1;} else { count++;}
	      
	      map.put(temp, count);
	    }
	    
	    int ans = 0;
	    for (int j = 1; j <= N; j++) {
	      if (map.get(j) == null) { ans = 0;} else { ans = map.get(j);}
	      System.out.println(ans);
	    }
	  }
}