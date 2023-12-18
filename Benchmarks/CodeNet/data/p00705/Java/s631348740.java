import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // int TC = Integer.parseInt(sc.next(), 10);
        
        while (true) {
            int N = sc.nextInt();
            int Q = sc.nextInt();
            if (N == 0 && Q == 0) break;
            
            int max = -999;
            int day = 999;
            int[] days = new int[100];
            
            for (int i = 0; i < N; i++) {
                int M = sc.nextInt();
                for (int j = 0; j < M; j++) {
                    int d = sc.nextInt() - 1;
                    days[d]++;
                    if (days[d] >= max) {
                        if (days[d] == max)
                            day = Math.min(d, day);
                        else
                            day = d;
                        max = days[d];
                    }
                }
            }
            
            if (max >= Q) {
                System.out.println(day + 1);
            } else {
                System.out.println(0);
            }
        }
    }
}


