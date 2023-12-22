import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt( br.readLine() );
        String[] strH = br.readLine().split(" ");
        int[] H = Stream.of(strH).mapToInt(Integer::parseInt).toArray();
        
        boolean isOK = true;
        for(int i = N - 1; i > 0; i--){
            if(H[i-1] - 1 > H[i]){
                isOK = false;
                break;
            } else if ( H[i-1] - 1 == H[i] ){
                H[i-1]--;
            }
        }
        
        System.out.println( isOK ? "Yes" : "No" );
    }
}
