import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            String[] str2 = str.split("");
            for(int i = 0; i < str2.length; i++){
              if("1".equals(str2[i])){
                System.out.print("9");
              } else {
                System.out.print("1");
            }
            }
          }
}