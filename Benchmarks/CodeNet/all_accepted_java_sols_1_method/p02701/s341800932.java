import java.util.*;
public class Main {
	public static void main(String[] args){
		Set<String> set = new HashSet<>();
	      Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
	      for(int i = 0; i < N; i++) {
	    	  String s = sc.next();
	    	  set.add(s);
	      }
	      System.out.println(set.size());
	}
}