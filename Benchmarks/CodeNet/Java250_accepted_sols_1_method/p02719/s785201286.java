import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        sc.close();

        if(N % K == 0){
            System.out.println("0");
        }else{
            long tmp1 = N / K;
            long tmp2 = tmp1 + 1;
            long a = Math.abs(N - K * tmp1);
            long b = Math.abs(N - K * tmp2);
            System.out.println(Math.min(a, b));
        }
    }
}
