import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String[] str1 = sc.next().split("");
            String[] str2 = sc.next().split("");
            int count = 0;
            for(int i = 0; i < str1.length; i++){
              if(str1[i].equals(str2[i])){
                count++;
              }
            }
            if(count == str1.length){
              System.out.println("Yes");
            } else {
              System.out.println("No");
            }
            }
}