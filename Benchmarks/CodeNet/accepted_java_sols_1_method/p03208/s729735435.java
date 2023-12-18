import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int p[] = new int[N];
        for(int i=0;i < N;i++){
            p[i] = scan.nextInt();
        }
        Arrays.sort(p);
        int min = p[K-1] - p[0];
        for(int i=1;i+K <= N;i++){
            if(min > (p[i + K - 1] - p[i])){
                min = (p[i + K - 1] - p[i]);
            }
        }
        System.out.println(min);
    }
}
