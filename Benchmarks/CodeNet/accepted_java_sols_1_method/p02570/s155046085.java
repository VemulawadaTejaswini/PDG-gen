import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int  d = Integer.parseInt(sn.next());
        int  t = Integer.parseInt(sn.next());
        int  s = Integer.parseInt(sn.next());
      if (d <= (t * s)){
        System.out.println("Yes");
      } else {
         System.out.println("No");
      }
   }
}
