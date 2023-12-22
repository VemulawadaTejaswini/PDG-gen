import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();

        long ans = 0;
        
        for(int i = 0 ; h > 0 ; i++){
        	ans += (long)1 << i;
        	h >>= 1;
        }

        System.out.println(ans);
    }
}