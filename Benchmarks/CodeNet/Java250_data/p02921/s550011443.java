import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String[] str1 = sc.next().split("");
            String[] str2 = sc.next().split("");
            int count = 0;
            for(int i = 0; i < 3; i++){
              if(str1[i].equals(str2[i])){
                count++;
              }
            }
            System.out.println(count);
          }
}