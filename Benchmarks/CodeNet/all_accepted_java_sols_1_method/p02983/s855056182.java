import java.util.*;
public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  long l = sc.nextLong();
	  long r = sc.nextLong();
      
      
      if(r-l > 3000) {
        System.out.println(0);
      }else {
      
        long min = 2018;
        for(long i = l; i < r; i++) {
          for(long j = l+1; j <=r; j++) {
            long num = (i*j)%2019;
            if(num<min) {
              min = num;
            }
          }
        }
                  System.out.println(min);

  
      }

      
	}
}