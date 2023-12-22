import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int d = 0,n,x,count = 1;
        
        n = sc.nextInt();
        x = sc.nextInt();
        
        for(int i = 0; i < n ; i++){
            d += sc.nextInt();
            if(d <= x) count++;
            else break;
        }
        System.out.println(count);
        
    }
}