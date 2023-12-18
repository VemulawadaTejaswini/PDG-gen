import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] N = new int[200001];
        int m1 = 0, m2 = 0;
        for(int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(sc.next());
            if(A[i] > m1) m1 = A[i];
            else if(A[i] > m2) m2 = A[i];
            N[A[i]]++;
        }
        for(int i = 0; i < n; i++) {
            if(A[i] == m1 && N[m1] == 1) sb.append(m2 + "\n");
            else sb.append(m1 + "\n");
        }
        System.out.print(sb);
    }
}
