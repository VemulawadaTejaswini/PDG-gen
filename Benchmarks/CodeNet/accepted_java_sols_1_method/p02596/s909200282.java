import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int K = scn.nextInt();
        int ans = -1;

        int a = 7 % K;
        for(int i = 0; i < K; i++) {
            if(a == 0) {
                ans = i+1;
                break;
            }
            a = (10*a + 7) % K;
        }

        System.out.println(ans);
    }
}