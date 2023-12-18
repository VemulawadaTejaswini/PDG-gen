import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int[][] sec = new int[n][2];
            for (int i = 0; i < sec.length; i++) {
                String s = sc.next();
                String t = sc.next();
                sec[i][0] = convert(s);
                sec[i][1] = convert(t);
            }
            
            Arrays.sort(sec, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if (o1[1] == o2[1]) {
                        return o1[0] - o2[0];
                    }
                    return o1[1] - o2[1];
                }
            });
            
            int ans=1;
            for (int i = 0; i < sec.length; i++) {
                int cnt = 1;
                int s = sec[i][0];
                int t = sec[i][1];
                for (int j = 0; j < sec.length; j++) {
                    if(i==j)continue;
                    int ss = sec[j][0];
                    int tt = sec[j][1];
                    if((s < ss && ss < t )|| (s < tt && tt < t)){
                        cnt++;
                        continue;
                    }
                }
                ans=Math.max(ans, cnt);
            }
            System.out.println(ans);
        }
    }

    static int convert(String s) {
        String[] ss = s.split(":");
        int h = Integer.parseInt(ss[0]);
        int m = Integer.parseInt(ss[1]);
        int se = Integer.parseInt(ss[2]);
        return h * 3600 + m * 60 + se;
    }
}