import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] NMC = line.split(" ");
        int N = Integer.parseInt(NMC[0]);
        int M = Integer.parseInt(NMC[1]);
        int C = Integer.parseInt(NMC[2]);
        
        line = scan.nextLine();
        String[] B_str = line.split(" ");
        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            B[i] = Integer.parseInt(B_str[i]);
        }
        
        int count = 0;
        for (int i = 0; i < N; i++) {
            line = scan.nextLine();
            String[] A_str = line.split(" ");
            int num = 0;
            
            int[] A = new int[M];
            for (int j = 0; j < M; j++) {
                A[j] = Integer.parseInt(A_str[j]);
                num += A[j] * B[j];
            }
            num += C;
            if (num > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}