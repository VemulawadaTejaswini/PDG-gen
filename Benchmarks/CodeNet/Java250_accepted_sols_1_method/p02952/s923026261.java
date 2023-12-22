import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        if(n < 10){
            ans = n;
        }else if(10 <= n && n < 100){
            ans = 9;
        }else if(100 <= n && n < 1000){
            ans = 10 + (n-100);
        }else if(1000 <= n && n < 10000){
            ans = 909;
        }else if(10000 <= n && n < 100000){
            ans = 910 + (n-10000);
        }else{
            ans = 90909;
        }
        System.out.println(ans);
        sc.close();

    }

}
