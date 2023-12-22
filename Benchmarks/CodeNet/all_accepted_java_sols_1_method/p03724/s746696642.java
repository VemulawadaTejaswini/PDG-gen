import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] peak = new int[N];
        int a, b;
        
        for(int i = 0; i < M; i++) {
            a = scan.nextInt();
            peak[a - 1]++;
            
            b = scan.nextInt();
            peak[b - 1]++;
        }
        
        for(int i = 0; i < N; i++) {
            if(peak[i] % 2 == 1) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
