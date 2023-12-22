import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans = 0;
        if(a == b && b == c){
            if(a % 2 == 0) ans = -1;
            else ans = 0;
        }else{
            while(a % 2 == 0 && b % 2 == 0 && c % 2 == 0){
                ans++;
                int tmpa = (b + c) /2;
                int tmpb = (c + a) /2;
                int tmpc = (a + b) /2;
                a = tmpa;
                b = tmpb;
                c = tmpc;
            }
        }
        System.out.println(ans);
        sc.close();
    }

}
