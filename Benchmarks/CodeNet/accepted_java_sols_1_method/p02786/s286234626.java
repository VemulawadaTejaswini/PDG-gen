import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        long h = Long.parseLong(sc.next());
        
        long ans = 0;
        long x = 1;
        while(h > 0){
            ans += x;
            x *= 2;
            h /= 2;
        }
        
        System.out.println(ans);
    }
}