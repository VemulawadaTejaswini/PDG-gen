import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d = in.nextInt();
        int[] ci = new int[26];
        HeuristicsTuple[] cTuples = new HeuristicsTuple[26];
        int[][] sdi = new int[d][26];
        for(int i=0; i<26; i++) {
            ci[i] = in.nextInt();
            HeuristicsTuple tuple = new HeuristicsTuple();
            tuple.type = i;
            tuple.c = ci[i];
            cTuples[i] = tuple;
        }
        for(int day=0; day<d; day++) {
            for(int i=1; i<26; i++) {
                sdi[day][i] = in.nextInt();
            }
        }
        
        Arrays.sort(cTuples);
        
        int[] ans = new int[d];
        for(int day=d-1; day>=d-26 && day>=0; day--) {
            int tupleIndex = d-day-1;
            ans[day] = cTuples[tupleIndex].type;
        }
        for(int day=0; day<d-26; day++) {
            int maxS = 0;
            int maxStype = 1;
            for(int i=0; i<26; i++) {
                if(maxS < sdi[day][i]) {
                    maxS = sdi[day][i];
                    maxStype = i;
                }
            }
            ans[day] = maxStype;
        }
        for(int day=0; day<d; day++) {
            System.out.println(ans[day]+1);
        }
    }
}

class HeuristicsTuple implements Comparable<HeuristicsTuple>{
    int type;
    int c;
    
    @Override
    public int compareTo(HeuristicsTuple o) {
        return o.c - this.c; // desc
    }
}
