import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        String status = "APPROVED";
        for (int i = 0; i < N; i++) {
            if (A[i] % 2 == 1) continue;

            if (A[i] % 3 != 0 && A[i] % 5 != 0) {
                status = "DENIED";
                break;
            }
        }
        System.out.println(status);
    }
}
