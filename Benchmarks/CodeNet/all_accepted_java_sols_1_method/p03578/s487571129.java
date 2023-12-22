import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] str = br.readLine().split(" ");

        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] nl = new int[n];
        for(int i=0; i<n; i++) nl[i] = Integer.parseInt(str[i]);
        Arrays.sort(nl);

        int m = Integer.parseInt(br.readLine());
        int[] ml = new int[m];
        str = br.readLine().split(" ");
        for(int i=0; i<m; i++) ml[i] = Integer.parseInt(str[i]);
        Arrays.sort(ml);

        int ni = 0;
        for(int i=0; i<m; i++){
            while(nl[ni] != ml[i]){
                ni++;
                if(ni >= n){
                    System.out.println("NO");
                    return;
                }
            }
            ni++;
        }

        System.out.println("YES");
    }
}
