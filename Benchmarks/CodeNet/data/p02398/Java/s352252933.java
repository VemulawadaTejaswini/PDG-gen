import java.util.*;

public class Main{
    public static void main(String[] args){
        int a, b, c, ans;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        ans = 0;
        for (int i=a; i<=b; i++){
            if (c%i==0) ans++;
        }
        System.out.println(ans);
    }
}
