import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strAry = br.readLine().split(" ");
        
        int W = Integer.parseInt(strAry[0]);
        int H = Integer.parseInt(strAry[1]);
        int x = Integer.parseInt(strAry[2]);
        int y = Integer.parseInt(strAry[3]);
        int r = Integer.parseInt(strAry[4]);
        
         if ( (x - r >= 0 && x + r <= W) && (y - r >= 0 && y + r <= H) ) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}