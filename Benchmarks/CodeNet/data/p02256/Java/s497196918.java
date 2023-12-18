import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(GreatestCommonDivisor(a, b));
   
    }
    public static int GreatestCommonDivisor(int a, int b){
        int x = Math.max(a,b);
        int y = Math.min(a,b);
        int temp = 0;
        while(y > 0){
            temp = x % y;
            x = y;
            y = temp;
            
        }
    return x;
        
    }
}
