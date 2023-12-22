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
        
        int[] lastday = new int[26];
        
        long score = 0;
        for(int day=1; day<=d; day++){
            int contest = t[day-1]-1;
            score += s[day-1][contest];
            lastday[contest] = day;
            for(int j=0; j<26; j++){
                score -= c[j] * (day-lastday[j]);
            }
            
            System.out.println(score);
        }
        
    }
    
}
