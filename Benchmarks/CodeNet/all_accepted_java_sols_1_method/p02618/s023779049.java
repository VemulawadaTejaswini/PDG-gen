import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        long startTime = System.currentTimeMillis();
    
        var sc = new Scanner(System.in);
    
        int D = Integer.parseInt(sc.next());
        var c = new int[27];
        for(int i = 1; i <= 26; i++){
            c[i] = Integer.parseInt(sc.next());
        }
        var s = new int[D+1][27];
        for(int d = 1; d <= D; d++){
            for(int i = 1; i <= 26; i++){
                s[d][i] = Integer.parseInt(sc.next());
            }
        }
    
        var t = new int[D+1];
        for(int d = 1; d <= D; d++){
            t[d] = (d-1)%26+1;
        }
        long maxScore = Long.MIN_VALUE;
        var max = new int[D+1];
        var rand = new Random();
        while(true){
            long score = 0;
            var last = new int[27];
            for(int d = 1; d <= D; d++){
                score += s[d][t[d]];
                last[t[d]] = d;
                for(int i = 1; i <= 26; i++){
                    score -= c[i] * (d - last[i]);
                }
            }
            if(score > maxScore){
                maxScore = score;
                max = t.clone();
            }
            long elapsedTime = System.currentTimeMillis() - startTime;
            if(elapsedTime > 1800) break;
            for(int d = 1; d <= D; d++){
                t[d] = rand.nextInt(26)+1;
            }
        }
        
        var sb = new StringBuilder();
        for(int i = 1; i <= D; i++){
            sb.append(max[i]).append(System.lineSeparator());
        }
        System.out.print(sb);
    }
}