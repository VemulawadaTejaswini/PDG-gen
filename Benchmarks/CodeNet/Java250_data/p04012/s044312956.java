import java.util.*;

public class Main{

     public static void main(String []args){
      Scanner in = new Scanner(System.in);       
        String s=in.next();
        int[] arr = new int[128];
       
         for (int i = 0; i < s.length(); i++) {
             arr[s.charAt(i)]++;
         }
               for (int i = 0; i < arr.length; i++) {
             if (arr[i]%2!=0){
                       System.out.println("No");
             return;
             }
         }
               System.out.println("Yes");
    }
}