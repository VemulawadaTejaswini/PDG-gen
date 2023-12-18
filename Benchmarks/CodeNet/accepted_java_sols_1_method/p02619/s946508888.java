import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
    
        int D = Integer.parseInt(sc.next());
        var c = new int[26];
        for(int i = 0; i < 26; i++){
            c[i] = Integer.parseInt(sc.next());
        }
        var s = new int[D][26];
        for(int d = 0; d < D; d++){
            for(int i = 0; i < 26; i++){
                s[d][i] = Integer.parseInt(sc.next());
            }
        }
        var t = new int[D];
        for(int d = 0; d < D; d++){
            t[d] = Integer.parseInt(sc.next()) -1;
        }
        
        long score = 0;
        var last = new int[26];
        Arrays.fill(last, -1);
        var sb = new StringBuilder();
        for(int d = 0; d < D; d++){
            score += s[d][t[d]];
            last[t[d]] = d;
            for(int i = 0; i < 26; i++){
                score -= c[i] * (d - last[i]);
            }
            sb.append(score).append(System.lineSeparator());
        }
        System.out.print(sb);
    }
}