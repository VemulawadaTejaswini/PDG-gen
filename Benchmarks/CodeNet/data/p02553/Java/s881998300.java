import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sn = new Scanner(System.in);
      Long a = Long.parseLong(sn.next());
      Long b = Long.parseLong(sn.next());
      Long c = Long.parseLong(sn.next());
      Long d = Long.parseLong(sn.next());
      Long x = 0L;
      Long y = 0L;
      Long cnt = 0L;
      if ( a < 0 && c < 0 ) {
         x = a;
         y = c;
      } else if ( a < 0 && c >= 0 ) {
         x = b;
         y = c;
      } else if ( a >= 0 && c < 0 ) {
         x = a;
         y = d;
      } else {
         x = b;
         y = d;
      }
      cnt = x * y ;
      System.out.println(cnt);
   }
}
