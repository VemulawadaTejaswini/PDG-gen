import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        solve1600();
    }

    public static void solve1600() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int m = sc.nextInt();
            int n_min = sc.nextInt();
            int n_max = sc.nextInt();
            if(m == 0 && n_min == 0 && n_max == 0){
                break;
            }
            int[] P = new int[m];
            int[] gap = new int[m-1];
            for (int i = 0; i < m; i++){
                if(i == 0) {
                    P[i] = sc.nextInt();
                } else {
                    P[i] = sc.nextInt();
                    gap[i-1] = P[i-1] - P[i];
                }
            }
            int gap_max = 0;
            int ans = 0;
            for (int j = n_min - 1; j < n_max; j++) {
                if(gap_max <= gap[j]){
                    gap_max = gap[j];
                    ans = j;
                }
            }
            System.out.println(ans + 1);
        }
    }
}