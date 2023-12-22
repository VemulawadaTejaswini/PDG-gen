import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int N = sc.nextInt();
        long power = 1;

        for (int i=1; i<=N; i++) {
            power = power * i % (1000000000 + 7);
        }
        System.out.println( power );
    }
}