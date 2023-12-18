import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int N = scanner.nextInt();

        int p[] = new int[N];
        for(int loop=0; loop<N; loop++) {
            p[loop] = scanner.nextInt();
        }

        int sol = X;
        int dis = 0;
        while(true) {

            int ans = sol - dis;

            boolean exist = false;
            for(int loop=0; loop<N; loop++) {
                if( ans == p[loop] ){
                    exist = true;
                    break;
                }
            }
            if( exist == false ) {
                sol = ans;
                break;
            }

            ans = sol + dis;

            exist = false;
            for(int loop=0; loop<N; loop++) {
                if( ans == p[loop] ){
                    exist = true;
                    break;
                }
            }
            if( exist == false ) {
                sol = ans;
                break;
            }

            dis++;
        }

        System.out.println( sol );

    }
}