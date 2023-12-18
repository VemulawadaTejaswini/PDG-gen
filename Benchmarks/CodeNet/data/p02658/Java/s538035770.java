import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();

        int ans = 1;
        for(int loop=0; loop<N; loop++) {
            int A = scanner.nextInt();
            ans *= A;
        }
        int ans_dummy = ans;
        for(int loop=0; loop<18; loop++) {
            ans_dummy /= 10;
        }
        if(ans_dummy>1) {
            ans = -1;
        }

        System.out.println( ans );
    }
}