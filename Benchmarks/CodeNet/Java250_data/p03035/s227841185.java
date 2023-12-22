import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int y = sc.nextInt();

     if ( a>=6 && a<=12) {
       System.out.println(y / 2);
     }

     if (a <= 5) {
       System.out.println("0");
     }

     if (a >= 13) {
       System.out.println(y);
     }
  }
}
