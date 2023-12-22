import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int ans = 0;
        for (int i=0;i<n;i++){
            long x = sc.nextLong();
            long y = sc.nextLong();
            if (true){
                if (Math.sqrt(x*x+y*y)<=d)ans++;
            }
        }
        System.out.println(ans);
    }
}
