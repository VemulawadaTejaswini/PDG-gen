import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long b = sc.nextLong();
        long n = sc.nextLong();
        long ans = 0L;
        if(n < b){
            ans = a * n /b;
        }else{
            ans = a*(b-1)/b;
        }
        System.out.println(ans);
        sc.close();

    }

}
