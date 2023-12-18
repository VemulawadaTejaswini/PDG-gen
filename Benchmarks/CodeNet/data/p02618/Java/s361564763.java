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
        
        int[] lastday = new int[26];
        
        long score = 0;
        for(int day=1; day<=d; day++){
            long max = (long)-1e8;
            int maxcontest = -1;
            for(int i=0; i<26; i++){
                long tmp = score + s[day-1][i];
                for(int j=0; j<26; j++){
                    if(i==j){
                        continue;
                    }
                    tmp -= c[j] * (day-lastday[j]);
                }
                if(max < tmp){
                    max = tmp;
                    maxcontest = i;
                }
            }
            
            lastday[maxcontest] = day;
            score = max;
            System.out.println(maxcontest+1);
        }
        
    }
    
}
