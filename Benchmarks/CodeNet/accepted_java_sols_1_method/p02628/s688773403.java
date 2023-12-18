import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int N = sc.nextInt();
        final int K = sc.nextInt();
        
        final int[] p = new int[N];
        for (int i = 0; i < N; i++) {
            p[i] = sc.nextInt();
        }
        
        int answer = Arrays.stream(p).sorted().limit(K).sum();
        
        System.out.println(answer);
    }
}
