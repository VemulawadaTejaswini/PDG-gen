import java.util.*;

public class Main{
    boolean[] used;
    int[] perm, time;
    int out;
    void solve(){
        Scanner scan = new Scanner(System.in);
        time = new int[5];
        for(int i = 0; i < 5; i++) time[i] = scan.nextInt();
        perm = new int[5];
        used = new boolean[5];
        out = Integer.MAX_VALUE;
        permutation(0);
        System.out.println(out);
        scan.close();
    }

    void permutation(int i){
        if(i == 5){
            int t = 0;
            for(int j = 0; j < 5; j++){
                t += time[perm[j]];
                if(j == 4) continue;
                t = t % 10 == 0 ? t : 10 * (t / 10 + 1);
            }
            out = Math.min(out, t);
            return;
        }
        for(int j = 0; j < 5; j++){
            if(!used[j]){
                perm[i] = j;
                used[j] = true;
                permutation(i + 1);
                used[j] = false;
            }
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}