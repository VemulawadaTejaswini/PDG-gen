import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] hl = new int[n];
        for(int i = 0; i < n; i++){
            hl[i] = sc.nextInt();
        }
        boolean[] bools = new boolean[n];
        Arrays.fill(bools,true);
        for(int i = 0; i < m; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            if(hl[a] < hl[b]){
                bools[a] = false;
            }else if(hl[a] > hl[b]){
                bools[b] = false;
            }else{
                bools[a] = false;
                bools[b] = false;
            }
        }
        int ans = 0;
        for(boolean b: bools){
            if(b) ans++;
        }
        System.out.println(ans);
    }
}

