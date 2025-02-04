
import java.util.Scanner;

/**
 *
 * @author bhatti
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        boolean[] blacklist = new boolean[]{true, true, true, true, true,
            true, true, true, true, true};

        for (int i = 0; i < K; ++i) {
            int d = sc.nextInt();
            blacklist[d] = false;
        }
        boolean breaked = false;    
        while (true) {
            breaked = false;
            StringBuilder builder = new StringBuilder(String.valueOf(N));
            for (int j = 0; j < builder.length(); ++j) {
                int value = Integer.valueOf(builder.substring(j, j + 1)).intValue();
                if (!blacklist[value]) {
                   // builder.setCharAt(j, String.valueOf(getNext(blacklist, value)).charAt(0));
                   breaked = true;
                   break;
                }
            }
            if (!breaked){
                System.out.println(N);
                break;
            }
            N++;
        }
        
    }
}
