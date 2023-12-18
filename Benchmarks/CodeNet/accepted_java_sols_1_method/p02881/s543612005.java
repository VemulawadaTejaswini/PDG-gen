import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.next());
        long ans_1=100_000_000_000_000L;
        long ans_2=100_000_000_000_000L;
        for (int i=1;i<Math.sqrt(N)+1;i++) {
            if (N%i==0) {
                if ((i+N/i)<(ans_1+ans_2)) {
                    ans_1 = i;
                    ans_2 = N/i;
                }
            }
        }
        System.out.println((ans_1+ans_2-2));
    }
}