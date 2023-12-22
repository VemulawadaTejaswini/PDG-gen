import java.util.*;
public class Main {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long A = scanner.nextLong();
        long B = scanner.nextLong();

        long times = N/(A+B);
        long ans = A * times;
        ans += Math.min(A, N%(A+B));
        System.out.println(ans);
    }
}
