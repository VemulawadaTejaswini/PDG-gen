import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();

        if ((b-a)%2==0){
            System.out.println((b-a)/2);
            return;
        }

        long ans = 0;

        if ((b-a)%2==1){
            if ((a-1)<(n-b)){
                ans += (a-1);
                b -= (a-1);
                ans += 1;
                ans += (b-1-1)/2;
                System.out.println(ans);
                return;
            }else {
                ans += (n-b);
                a += (n-b);
                ans += 1;
                ans += (n-(a+1))/2;
                System.out.println(ans);
                return;
            }
        }


    }
}