import java.util.*;
import static java.lang.System.*;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int N = sc.nextInt();
	  long count = 0;
	  HashMap<String,Long> map = new HashMap<>();
	  for(int i=0; i<N; i++) {
		  String s = sc.next();
		  char[] c = s.toCharArray();
		  Arrays.sort(c);
		  String sorted = new String(c);
		  //文字列が初出のとき
		  if (!map.containsKey(sorted)) {
			   map.put(sorted, (long) 0);
		  } else {
			  long n = map.get(sorted) + 1;
			  count += n;
			  map.put(sorted, n);
		  }
  }
  out.println(count);	  
  }
}