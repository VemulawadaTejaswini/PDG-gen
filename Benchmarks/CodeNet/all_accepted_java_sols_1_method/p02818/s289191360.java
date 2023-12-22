import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      long a = sc.nextLong();
      long b = sc.nextLong();
      long k = sc.nextLong();


      if (a<k) {
        System.out.print(0);
        System.out.print(" ");
        if (b-(k-a)<0) {
          System.out.print(0);
          System.out.println();
          System.exit(0);
        }else{
          System.out.print(b-(k-a));
          System.out.println();
          System.exit(0);
        }
      }else{
        System.out.print(a-k);
        System.out.print(" ");
        System.out.print(b);
        System.out.println();
      }

    }
}
