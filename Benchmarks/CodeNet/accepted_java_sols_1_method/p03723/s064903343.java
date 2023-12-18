import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans = 0;
        if(a == b && b == c){
            if(a % 2 == 0){
                System.out.println(-1);
                
            }else{
                System.out.println(0);
            }
            return;
        }
        while(a % 2 == 0 && b % 2 == 0 && c % 2 == 0){
            ans++;
            int tmpa = a;
            int tmpb = b;
            int tmpc = c;
            a = tmpb/2 + tmpc/2;
            b = tmpc/2 + tmpa/2;
            c = tmpa/2 + tmpb/2;
        }
        System.out.println(ans);
    }
}
