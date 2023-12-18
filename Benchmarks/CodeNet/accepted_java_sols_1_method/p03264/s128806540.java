import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int s = (a/2);
            int v = (a/2)+1;
            if(a%2==0){
              System.out.println(s*s);
            } else {
              System.out.println(s*v);
            }
            }
}