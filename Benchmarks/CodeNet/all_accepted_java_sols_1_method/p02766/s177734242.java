import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        sc.close();

        long count = 1;
        long judge = N;
        while(judge >= K){
            judge /= K;
            count++;
        }

        System.out.println(count);
    }
}