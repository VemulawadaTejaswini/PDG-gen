import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        int Q = sc.nextInt();
        int[] Az = new int[Q];
        for (int i = 0; i < Q; i++) {
            Az[i] = sc.nextInt() - 1;
        }
        int[] rightNum = new int[N];
        for (int i = 0; i < Q; i++) {
            rightNum[Az[i]] ++;
        }

        for (int i = 0; i < N; i++) {
            rightNum[i] = Q - rightNum[i];
        }
        for (int i = 0; i < N; i++) {
            if (rightNum[i] >= K){
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }



    }
}
