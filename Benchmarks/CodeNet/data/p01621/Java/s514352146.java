import java.util.*;

class Main {
    public static void main(String[] args) {
        boolean[] bonus = new boolean[60*24*7];
        int S, N, T, P, M;
        String WEEK, TIME;
        Scanner sc = new Scanner(System.in);

        while(true) {
            Arrays.fill(bonus, false);
            S = sc.nextInt();
            N = sc.nextInt();
            T = sc.nextInt();
            WEEK = sc.next();
            TIME = sc.next();
            P = sc.nextInt();
            M = sc.nextInt();

            if(WEEK.equals("All")) {
                if(TIME.equals("All")) {
                    Arrays.fill(bonus, true);
                }
                else if(TIME.equals("Night")) {
                    for(int i = 0; i < 7; i++) {
                        Arrays.fill(bonus, 60*24*i, 60*24*i + 60*6, true);
                        Arrays.fill(bonus, 60*24*i + 60*18, 60*24*i + 60*24, true);
                    }
                }
                else {
                    for(int i = 0; i < 7; i++) {
                        Arrays.fill(bonus, 60*24*i + 60*6, 60*24*i + 60*18, true);
                    }
                }
            }
            else {
                if(TIME.equals("All")) {
                    Arrays.fill(bonus, 0, 60*24, true);
                }
                else if(TIME.equals("Night")) {
                    Arrays.fill(bonus, 0, 60*6, true);
                    Arrays.fill(bonus, 60*18, 60*24, true);
                }
                else {
                    Arrays.fill(bonus, 60*6, 60*18, true);
                }
            }

            int match = 0;
            for(int start = 0; start < 60*24*7; start++) {
                int tmp = 0;
                for(int i = 0; i < M; i++) {
                    if(bonus[(start + T*i) % (60*24*7)] && bonus[(start + T*i + S) % (60*24*7)]) {
                        tmp++;
                    }
                }
                match = Math.max(match, tmp);
            }
            System.out.printf("%.10f\n", 1-Math.pow(1.0 - 1.0 / P, match * N));
        }
    }
}