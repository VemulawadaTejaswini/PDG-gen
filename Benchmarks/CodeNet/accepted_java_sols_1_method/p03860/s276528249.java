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
            System.out.println(str1a[0] + str2a[0] + str3a[0]);
            }
}