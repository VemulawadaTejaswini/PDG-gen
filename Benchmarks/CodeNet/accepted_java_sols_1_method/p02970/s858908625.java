import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int ans = 0;
        while(n > 0){
            n -= d * 2 + 1;
            ans += 1;
        }
        System.out.println(ans);
    }
}