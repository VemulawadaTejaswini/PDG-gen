import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N+2];
        A[0] = 0;
        for (int i = 1; i < N+1; i++) {
                A[i] = sc.nextInt();
        }
        A[N+1] = 0;
        int[] abs = new int[N+1];
        for (int i = 0; i < N+1; i++) {
            abs[i] = Math.abs(A[i]-A[i+1]);
        }
        int cost = Arrays.stream(abs).sum();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < N+1; i++) {
            int beforeAbs = abs[i]+abs[i-1];
            int nowAbs = Math.abs(A[i+1]-A[i-1]);
            sb.append(cost-beforeAbs+nowAbs+"\n");
        }
        System.out.println(sb);
    }    
}
