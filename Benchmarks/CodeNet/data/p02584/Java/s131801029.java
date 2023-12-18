import java.util.Scanner;

public class Main {
    static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        long x = sc.nextLong(), k = sc.nextLong(), d = sc.nextLong(), ans;
        x = Math.abs(x);
        long step = Math.min(k, x/d);
        k -= step;
        x -= d*step;
        if (k%2 == 0){
            ans = x;
        }else{
            ans = d - x;
        }
        System.out.println(ans);
    }    
}