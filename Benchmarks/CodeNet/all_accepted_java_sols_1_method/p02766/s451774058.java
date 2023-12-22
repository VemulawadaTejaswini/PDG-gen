import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int K = sc.nextInt();
        int count = 1;
        while (N >= K) {
            //System.out.println(N);
            N /= K;            
            count++;
        }
        System.out.println(count);
    }
}