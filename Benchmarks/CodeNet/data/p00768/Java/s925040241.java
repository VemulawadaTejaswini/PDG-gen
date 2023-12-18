import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    static class Team {
    	int team, solved, elapsed, penalty;
    	Team(int t) {
    		team =t ; 
    	}
    }
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            while(sc.hasNext()) {
                int M = sc.nextInt();
                int T = sc.nextInt();
                int P = sc.nextInt();
                int R = sc.nextInt();
                if(T == 0) break;
                Team[] ts = IntStream.range(0, T).mapToObj(t -> new Team(t+1)).toArray(Team[]::new);
                
                IntStream.range(0, R).forEach(dummy -> {
                    int m = sc.nextInt();
                    int t = sc.nextInt()-1;
                    int p = sc.nextInt();
                    int j = sc.nextInt();
                    if(j == 0) {
                        ts[t].solved |=  (1 << p);//bitで何問解いたかカウント
                        ts[t].elapsed = m;
                    }
                    else {
                        ts[t].penalty += 20;
                    }
                });//準備
                
                IntStream.range(0, T).forEach(t -> {
                    ts[t].solved= Integer.bitCount(ts[t].solved);
                    ts[t].elapsed += ts[t].penalty;
                });//解いてたらペナルティ分を足す
                
                Arrays.sort(ts, (t1, t2)->{
                    if(t1.solved == t2.solved) {
                        return t1.elapsed - t2.elapsed;
                    }
                    return t2.solved - t1.solved;
                });//問題数降順→経過時間で昇順
                
                int score = ts[0].solved * M + ts[0].elapsed;
                
                System.out.print(ts[0].team);
                for(int i = 1; i < T; i++) {
                    int s = ts[i].solved * M + ts[i].elapsed;//同順位のものを探す
                    System.out.print(s == score ? "=" : ",");
                    System.out.print(ts[i].team);
                    score = s;
                }
                
                System.out.println();
            }
        }
    }
}
