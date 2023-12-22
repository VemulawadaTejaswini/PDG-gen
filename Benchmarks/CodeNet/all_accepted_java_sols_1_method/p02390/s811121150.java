import java.util.*;
public class Main {
static Scanner sc= new Scanner(System.in);
   public static void main(String[] args) {
       int x =sc.nextInt();
      // System.out.println((x/60));
      // System.out.println((x/3600));
      System.out.println((x/3600)+":"+((x/60)-(x/3600)*60)+":"+(x-(((x/60)-(x/3600)*60)*60)-(x/3600)*3600));
   }
}