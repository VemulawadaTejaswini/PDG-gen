import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str1 = sc.next();
            String str2 = sc.next();
            String str3 = sc.next();
            String[] str1a = str1.split("");
            String[] str2a = str2.split("");
            String[] str3a = str3.split("");
            if(str2a[0].equals(str1a[str1a.length-1]) && str3a[0].equals(str2a[str2a.length-1])){
              System.out.println("YES");
            } else {
              System.out.println("NO");
            }
          }
}