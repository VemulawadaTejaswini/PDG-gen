import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         String s = sc.next();
         int result = 0;
        for(int i = 0;i<n-2;i++){
            String sub = s.substring(i,i+3);
            if(sub.equals("ABC")){
                result++;
            }
        }
        System.out.println(result);
        sc.close();
    }
}