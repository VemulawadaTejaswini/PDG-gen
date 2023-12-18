import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        solve1600();
    }

    public static void solve1600(){
        Scanner sc = new Scanner(System.in);
        while(true) {
            int m = sc.nextInt();
            int n_min = sc.nextInt();
            int n_max = sc.nextInt();
            if (m == 0 && n_min == 0 && n_max == 0) {
                break;
            }

            int[] tokuten = new int[m];
            int[] gap = new int[m-1];
            for (int i = 0; i < m; i++) {
                tokuten[i] = sc.nextInt();
                if(i != 0){
                    gap[i-1] = tokuten[i-1] - tokuten[i];
                }
            }
            int answer = 0;
            int gap_max = 0;
            for(int gap_index = n_min - 1; gap_index < n_max; gap_index++){
                if(gap_max <= gap[gap_index]){
                    gap_max = gap[gap_index];
                    if(gap_max == gap[gap_index]) {
                        answer = gap_index + 1;
                    } else {
                        answer = gap_index;
                    }
                }
            }
            System.out.println(answer);
        }
    }
}