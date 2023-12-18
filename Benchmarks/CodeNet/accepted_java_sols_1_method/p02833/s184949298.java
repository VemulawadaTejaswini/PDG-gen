import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        if (n%2==1){
            System.out.println(0);
            return;
        }

//        n /= 10;
//        n *= 10;

        long ans = 0;

        long len = String.valueOf(n).length();

        if (len==1){
            System.out.println(0);
            return;
        }


        for (int i=1; i<=26; i++){
            ans += n/(long)Math.pow(5,i)/2;

        }
        System.out.println(ans);

    }

}
