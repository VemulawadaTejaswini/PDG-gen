import java.util.*;
import java.lang.Character;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        float k = sc.nextFloat();
        int ans = 0;
        
        int j = 0;
        while(s.charAt(j) == '1'){
            ans = 1;
            if(j >= s.length()-1 || j >= k){
                break;
            }
            j++;
        }
        if(j < k){
            ans = Character.getNumericValue(s.charAt(j));
        }
        System.out.println(ans);
    }
}