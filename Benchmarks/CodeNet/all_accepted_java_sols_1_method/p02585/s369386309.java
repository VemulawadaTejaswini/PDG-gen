import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        var sc = new Scanner(System.in);
    
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        var p = new int[n+1];
        for(int i = 1; i <= n; i++){
            p[i] = Integer.parseInt(sc.next());
        }
        var c = new int[n+1];
        for(int i = 1; i <= n; i++){
            c[i] = Integer.parseInt(sc.next());
        }
        
        long ans = Long.MIN_VALUE;
        var maxScore = new long[n+1];
        for(int i = 1; i <= n; i++){
            int pos = p[i];
            int move = 1;
            long score = c[pos];
            maxScore[move] = score;
            while(pos != i && move < k){
                pos = p[pos];
                move++;
                score += c[pos];
                maxScore[move] = Math.max(score, maxScore[move-1]);
            }
            ans = Math.max(maxScore[move], ans);
            if(pos == i && score > 0){
                int j = k%move;
                if(j != 0){
                    ans = Math.max(score * (k / move) + maxScore[k%move], ans);
                }else{
                    ans = Math.max(score * (k / move -1) + maxScore[move], ans);
                }
            }
        }
        System.out.println(ans);
    }
}
