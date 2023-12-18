import java.util.*;
public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  long l = sc.nextLong();
	  long r = sc.nextLong();
      
      if(r > l+4038)
        r = l+4038;
      
      long min = 2018;
      long num;
      int cnt = 0;
      for(long i = l; i < r; i++) {
        for(long j = l+1; j <= r; j++) {
          num = ((i*j)%2019);
          if(num < min) {
            min = num;
            if(num == 0) {
              break;
            }
          }
        }
      }
      System.out.println(min);
	}
}