
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author k16069kk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int H = 0;
        int W = 0;
        while ((line = br.readLine()) != null) {
            java.util.StringTokenizer st = new StringTokenizer(line, " ");
            while (st.hasMoreTokens()) {
                H = Integer.parseInt(st.nextToken());
                W = Integer.parseInt(st.nextToken());
                for (int i = 0; i < H; i++) {
                    for (int j = 0; j < W; j++) {
                        System.out.print("#");
                    }
                    System.out.println();
                }
                System.out.println("");
                if(H == 0 && W == 0) break;
            }
            if(H == 0 && W == 0) break;
        }
        
    }

}

