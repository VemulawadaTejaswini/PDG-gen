import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        long [] app = new long[S];
        long anc = 0;
        long keep = 0;
        int count = 1;
        for(int i = 0;i < S;i++){
            int T = sc.nextInt();
            app[i] = T;
        }
        for(int i = 0;i < (S-1);i++){
            for(int l = count;l < S;l++){
                keep = app[i]*app[l];
                anc += keep;
                
            }
            count++;
        }
        System.out.println(anc%1000000007);
    }
}
