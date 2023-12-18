import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @param args
 */
public class Main {
    static final String HASHMARK = "#";
    static final String DOTMARK  = ".";
    static final String SPACE    = " ";
    
    public static void main(String[] args) {
        try {
            BufferedReader stdReader = new BufferedReader(
                    new InputStreamReader(System.in));
            
            String sStr;
            while ((sStr = stdReader.readLine()) != null) {
                String[] inputs = sStr.split(" ");
                
                int n = Integer.valueOf(inputs[0]);
                call(n);
            }
            stdReader.close();
        } catch (Exception e) {
            System.exit(-1);
        }
    }
    
    // void call(int n){
    // int i = 1;
    // CHECK_NUM:
    // int x = i;
    // if ( x % 3 == 0 ){
    // cout << " " << i;
    // goto END_CHECK_NUM;
    // }
    // INCLUDE3:
    // if ( x % 10 == 3 ){
    // cout << " " << i;
    // goto END_CHECK_NUM;
    // }
    // x /= 10;
    // if ( x ) goto INCLUDE3;
    // END_CHECK_NUM:
    // if ( ++i <= n ) goto CHECK_NUM;
    //
    // cout << endl;
    // }
    
    private static void call(int n) {
        int i = 1;
        boolean flg = false;
        
        while (true) {
            // CHECK_NUM:
            int x = i;
            if (x % 3 == 0) {
                System.out.print(SPACE + i);
                if (++i <= n) {
                    continue;
                } else {
                    break;
                }
            }
            
            // INCLUDE3:
            do {
                if (x % 10 == 3) {
                    System.out.print(SPACE + i);
                    if (++i <= n) {
                        flg = true;
                        break;
                    }
                }
                x /= 10;
            } while (0 != x );
            if (flg) {
                flg = false;
                continue;
            }
            if (++i <= n) {
                continue;
            } else {
                break;
            }
        }
        
        System.out.println();
    }
}