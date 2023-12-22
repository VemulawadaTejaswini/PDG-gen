import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = Long.parseLong(sc.next());
    long min = Long.MAX_VALUE;
    List<Long> list  = new ArrayList<>();
    for(long i = 1; i <= 1000000l; i++) {
      if(n%i==0) {
		list.add(i+n/i-2);
      }
      if(n<i)
        break;
    }
    for(Long i : list) {
	  if(i < min) {
        min = i;
      }
    }
    System.out.println(min);
  }
}
