import java.util.*;

public class Main{
    
    static final int MOD = (int)1e9+7;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int d = Integer.parseInt(sc.next());
        
        int[] c = new int[26];
        for(int i=0; i<26; i++){
            c[i] = Integer.parseInt(sc.next());
        }
        
        int[][] s = new int[d][26];
        for(int i=0; i<d; i++){
            for(int j=0; j<26; j++){
                s[i][j] = Integer.parseInt(sc.next());
            }
        }
        
        int[] t = new int[d];
        for(int i=0; i<d; i++){
            t[i] = Integer.parseInt(sc.next());
        }
        
        int[][] nocontest = new int[d+1][26];
        
        long score = 0;
        long[] scorememo = new long[d+1];
        for(int day=1; day<=d; day++){
            int contest = t[day-1]-1;
            score += s[day-1][contest];
            for(int j=0; j<26; j++){
                if(j==contest){
                    nocontest[day][j] = 0;
                }else{
                    nocontest[day][j] = nocontest[day-1][j]+1;
                }
            }
            for(int j=0; j<26; j++){
                score -= c[j] * nocontest[day][j];
            }
            scorememo[day] = score;
        }
        
        for(int i=0; i<=d; i++){
            //System.out.println(scorememo[i]);
        }
        
        int m = Integer.parseInt(sc.next());
        int[][] q = new int[m][2];
        for(int i=0; i<m; i++){
            for(int j=0; j<2; j++){
                q[i][j] = Integer.parseInt(sc.next());
            }
        }
        
        for(int i=0; i<m; i++){
            int qday = q[i][0];
            int qidx = q[i][1];
            t[qday-1] = qidx;
            score = scorememo[qday-1];
            for(int day = qday; day<=d; day++){
                int contest = t[day-1]-1;
                score += s[day-1][contest];
                for(int j=0; j<26; j++){
                    if(j==contest){
                        nocontest[day][j] = 0;
                    }else{
                        nocontest[day][j] = nocontest[day-1][j]+1;
                    }
                }
                for(int j=0; j<26; j++){
                    score -= c[j] * nocontest[day][j];
                }
                scorememo[day] = score;
            }
            System.out.println(score);
        }
        
    }
    
}
