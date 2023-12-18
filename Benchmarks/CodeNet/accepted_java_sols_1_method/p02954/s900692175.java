import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int N = S.length();
        
        int[] childrenNum = new int[N];
        TreeSet<Integer> RLnoRnoIndex = new TreeSet<>();
        
        for(int i = 0; i < N - 1; i++){
            if ( S.charAt(i) == 'R' && S.charAt(i+1) == 'L' ) {
                RLnoRnoIndex.add(i);
            }
        }
        
        //Rについて最初からループ
        for(int i = 0; i < N - 1; i++){
            if ( S.charAt(i) == 'R' && S.charAt(i+1) == 'R' ) {
                int RIndex = RLnoRnoIndex.higher(i);
                if ( (RIndex - i) % 2 == 0){
                    childrenNum[RIndex]++;
                } else {
                    childrenNum[RIndex+1]++;
                }
            }
            
            if ( S.charAt(i) == 'R' && S.charAt(i+1) == 'L' ) {
                childrenNum[i]++;
            }
        }
        
        //Lについて最後からループ
        for(int i = N - 1; i >= 1; i--){
            if ( S.charAt(i) == 'L' && S.charAt(i-1) == 'L' ) {
                int RIndex = RLnoRnoIndex.lower(i);
                if ( (i - RIndex) % 2 == 0 ){
                    childrenNum[RIndex]++;
                } else {
                    childrenNum[RIndex+1]++;
                }
            }
            
            if ( S.charAt(i) == 'L' && S.charAt(i-1) == 'R' ) {
                childrenNum[i]++;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < N; i++){
            sb.append(String.valueOf(childrenNum[i]));
            if ( i != N - 1 ) sb.append(" ");
        }
        
        System.out.println(sb);
    }
}
