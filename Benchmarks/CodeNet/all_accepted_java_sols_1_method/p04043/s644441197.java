import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String a = sc.next();
            String b = sc.next();
            String c = sc.next();
            String[] list = {a, b, c};
            Arrays.sort(list);
            if("5".equals(list[0]) && "5".equals(list[1]) && "7".equals(list[2])){
              System.out.println("YES");
            } else {
              System.out.println("NO");
            }
          }
}