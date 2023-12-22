import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int T = in.nextInt();
        int[] c = new int[N];
        int[] t = new int[N];
        for(int i=0; i<N; i++) {
            c[i] = in.nextInt();
            t[i] = in.nextInt();
        }

        int ans = -1;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<N; i++) {
            if(t[i] > T) {
                continue;
            } else {
                if(c[i] < min) {
                    ans = i;
                    min = c[i];
                }
            }
        }

        if(ans == -1) System.out.println("TLE");
        else System.out.println(min);
    }
}