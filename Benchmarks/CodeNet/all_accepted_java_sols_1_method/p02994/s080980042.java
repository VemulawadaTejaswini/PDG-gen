
import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int L = stdIn.nextInt();
        int minAbs = 100 + 200 - 1;
        int t = 0;
        if(L <= 0){
            if(L + n - 1 >= 0);
            else t = L + n - 1;
        }else{
            t = L;
        }
        System.out.println( n * (n + 2 * L -1) / 2 - t );
    }
}