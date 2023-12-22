import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();

        long divide = (long) N/(A+B);
        long ans = 0;
        ans += divide * A;

        if(N%(A+B) >= A){
            ans += A;
        }else{
            ans += N%(A+B);
        }

        System.out.println(ans);

    }

}
