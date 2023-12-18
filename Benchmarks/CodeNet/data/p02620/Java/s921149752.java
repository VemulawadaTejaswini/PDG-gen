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
        var t = new int[D+1];
        for(int d = 1; d <= D; d++){
            t[d] = Integer.parseInt(sc.next());
        }
        
        var a = new int[27][D+1];
        long score = 0;
        for(int i = 1; i <= 26; i++){
            for(int d = 1; d <= D; d++){
                if(t[d] == i){
                    a[i][d] = 0;
                    score += s[d][i];
                }else{
                    a[i][d] = a[i][d-1]+1;
                    score -= c[i] * a[i][d];
                }
            }
        }
        
        int M = Integer.parseInt(sc.next());
        var sb = new StringBuilder();
        for(int i = 0; i < M; i++){
            int d = Integer.parseInt(sc.next());
            int q = Integer.parseInt(sc.next());
            int r = t[d];
            t[d] = q;
            score -= s[d][r];
            for(int j = d; j <= D; j++){
                if(t[j] == r) break;
                score += c[r] * a[r][j];
                a[r][j] = a[r][j-1]+1;
                score -= c[r] * a[r][j];
            }
            score += s[d][q];
            score += c[q] * a[q][d];
            a[q][d] = 0;
            for(int j = d+1; j <= D; j++){
                if(t[j] == q) break;
                score += c[q] * a[q][j];
                a[q][j] = a[q][j-1]+1;
                score -= c[q] * a[q][j];
            }
            sb.append(score).append(System.lineSeparator());
        }
        System.out.print(sb);
    }
}