import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int t = 7;
        for (int i = 0; i < K; i++){
            if (t % K == 0){
                System.out.println(i + 1);
                System.exit(0);
            }
            t = (t * 10 + 7) % K;
        }

        System.out.println("-1");

    }
}