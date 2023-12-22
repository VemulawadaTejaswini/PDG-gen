import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        boolean debug = false;
        if (debug != false) {
            return;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        long[] H;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            H = new long[N];
            for (int i = 0; i < N; i++) {
                H[i] = sc.nextLong();
            }
        }
        long[] L = new long[N];
        for (int i = 0; i < N; i++) {
            L[i] = H[i] -1;
        }



        if (H.length == 1) {
            System.out.println("Yes");
            return;
        }
        if (H.length == 2 && H[0] - H[1] <= 1) {
            System.out.println("Yes");
            return;
        }

        long min = H[0];
        for (int i = 1; i < N; i++) {
            if(min >H[i]&& min >L[i]){
                System.out.println("No");
                return;
            }else{
                if(min >H[i]){
                    min = L[i];
                    continue;
                }else if(min >L[i]){
                    min = H[i];
                    continue;
                }
                if(H[i] > L[i]){
                    min = L[i];
                }else{
                    min = H[i];
                }
            }

        }

        System.out.println("Yes");
        return;

    }
}
