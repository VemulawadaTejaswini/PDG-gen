import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int  n = Integer.parseInt(sn.next());
        int  x = Integer.parseInt(sn.next());
        int  t = Integer.parseInt(sn.next());
        int c = n % x;
      if (c > 0){
        System.out.println((n / x + 1)* t);
      } else {
         System.out.println((n / x )* t);
      }
   }
}
