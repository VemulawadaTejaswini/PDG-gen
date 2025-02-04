import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String gp = sc.next();
        sc.close();

        int p_cnt = 0;
        int g_cnt = 0;
        int score = 0;
        for (int i = 0; i <= gp.length() - 1; i++) {
            if(gp.charAt(i) == 'g'){
                if(p_cnt < g_cnt) {
                    p_cnt++;
                    score++;
                } else {
                    g_cnt++;
                }
            } else {
                if(p_cnt < g_cnt) {
                    p_cnt++;
                } else {
                    g_cnt++;
                    score--;
                }
            }
        }
        System.out.println(score);
    }
}
