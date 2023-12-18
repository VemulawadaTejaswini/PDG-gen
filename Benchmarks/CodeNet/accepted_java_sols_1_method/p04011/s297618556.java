
import java.util.*;

public class Main{
    public static void main(String[] args) {
        
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(n >= k){
            sum = k * x + (n - k) * y;
        }else{
            sum = n * x;
        }
        System.out.println(sum);
    }
}