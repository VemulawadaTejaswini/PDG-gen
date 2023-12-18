import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int N = sc.nextInt();
        int K = sc.nextInt();
        int p[] = new int[N];
        for(int i=0;i<N;i++){
            p[i] = sc.nextInt();
        }
        Arrays.sort(p);
        for(int l=0;l<K;l++ ){
            sum += p[l];
        }
        System.out.println(sum);
    }
}
