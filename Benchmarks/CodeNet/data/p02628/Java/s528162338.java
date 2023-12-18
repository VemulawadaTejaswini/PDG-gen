import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int [] app = new int[N];
        int anc = 0;
        for(int i = 0;i < N;i++){
            int p = sc.nextInt();
            app[i] = p;
        }
        Arrays.sort(app);
        for(int i = 0;i < K;i++){
            anc += app[i];
        }
        System.out.println(anc);
    }
}