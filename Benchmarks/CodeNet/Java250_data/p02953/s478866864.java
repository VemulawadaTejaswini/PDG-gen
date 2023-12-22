import java.util.*;
import java.lang.*;

public class Main {
    static void answer(boolean ans){
        System.out.println(ans ? "Yes" : "No");
        System.exit(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] H = new long[N+1];
        for(int n=1; n<=N; n++) H[n]=sc.nextLong();

        for(int n=1; n<=N; n++){
            if(H[n-1] > H[n]) answer(false);
            if(H[n-1] < H[n]) H[n]--;
        }
        answer(true);
    }
}
