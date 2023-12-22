import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] S = sc.next().split("");
        int[] ans = new int[S.length];
        int count = 0;
        for (int i = 0; i < S.length-1; i++) {
            String now = S[i];
            String next = S[i+1];
            if (now.equals("R")) {
                count++;
            }
            if ((now+next).equals("RL")) {
                int rin = (count+1)/2;
                int lin = (count)-rin;
                ans[i] += rin;
                ans[i+1] += lin;
                count = 0;
            }
        }
        for (int i = S.length-1; 0 < i; i--) {
            String now = S[i];
            String next = S[i-1];
            if (now.equals("L")) {
                count++;
            }
            if ((next+now).equals("RL")) {
                int lin = (count+1)/2;
                int rin = (count)-lin;               
                ans[i] += lin;
                ans[i-1] += rin;
                count = 0;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i : ans) {
            sb.append(i+" ");
        }
        System.out.println(sb);
    }
}
