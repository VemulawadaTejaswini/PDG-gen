import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        int H[] = new int[N];
        long sum = 0;
        for(int i=0;i<N;i++)
        {
            H[i] = sc.nextInt();
        }
        Arrays.sort(H);
        for(int j=0;j<N-K;j++)
        {
            sum = sum + H[j];
        }
        System.out.println(sum);
    }
}
