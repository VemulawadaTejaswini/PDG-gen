import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      long total = 1;
      for(int i = 0; i < n; i++) {
      long a = sc.nextLong();
      if(a == 0) {
        total = 0;
      } else {
        if(total <= ((long)Math.pow(10, 18))) {
          if(total >= 0) total *= a;
        } else {
          total = -1;
        }
      }
    }
      System.out.print(total);
    }
}
