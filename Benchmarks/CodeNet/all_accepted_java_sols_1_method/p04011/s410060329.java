import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            if(a < b){
              System.out.println(a*c);
            } else {
              System.out.println(b*c + (a-b)* d);
            }
          }
}