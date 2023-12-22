import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str1 = sc.next();
            String str2 = sc.next();
            if("H".equals(str1) && "H".equals(str2) || "D".equals(str1) && "D".equals(str2)){
              System.out.println("H");
            } else {
              System.out.println("D");
            }
            }
}