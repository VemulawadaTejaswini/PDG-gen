import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long K = sc.nextLong();
        long sum = 0;
        if(A>=K)
        {
            sum = K;
        }
        else if(K - A - B <=0)
        {
            sum = A;
        }
        else
        {
            K = K - A - B;
            sum = A - K;
        }
        System.out.println(sum);
    }
}
