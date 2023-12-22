import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        int n,k,count = 0;
        
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        k = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            int h = sc.nextInt();
            if(h >= k) count++;
        }
        
        System.out.println(count);
    }
}
