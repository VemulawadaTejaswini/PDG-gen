import java.util.*;

class Main {

    static int answer = 0;

    static void solve(int n, int s, int k) {

        if (n == 0) {
            if (s == 0) {
                answer += 1;
                return;
            } else {
                return;
            }
        } else if (s < k) {
            return;
        } else if (k >= 10) {
            return;
        }
        
        solve(n, s, k+1);
        solve(n-1, s-k, k+1); 

    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            answer = 0;

            if(n == 0 && s == 0)    break;

            solve(n, s, 0);
            System.out.println(answer);
        }

    }
}