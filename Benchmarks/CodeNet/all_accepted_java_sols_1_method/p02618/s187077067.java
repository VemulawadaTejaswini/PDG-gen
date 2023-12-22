import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
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
    
        var last = new int[27];
        var sb = new StringBuilder();
        for(int d = 1; d <= D; d++){
            int max = Integer.MIN_VALUE;
            int contest = 1;
            for(int i = 1; i <= 26; i++){
                int score = s[d][i];
                for(int j = 1; j <= 26; j++){
                    if(i == j) continue;
                    score -= c[i] * (d - last[i]);
                }
                if(score > max){
                    max = score;
                    contest = i;
                }
            }
            last[contest] = d;
            sb.append(contest).append(System.lineSeparator());
        }
        System.out.print(sb);
    }
}