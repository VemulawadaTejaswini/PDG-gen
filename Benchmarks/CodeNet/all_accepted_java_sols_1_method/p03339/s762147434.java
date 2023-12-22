import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        char[] s = sc.nextLine().toCharArray();
        sc.close();

        int[] wCnt = new int[n];
        int[] eCnt = new int[n];
        for(int i=0; i<n; i++) {
            if(s[i] == 'W') {
                wCnt[i]++;
            } else {
                eCnt[i]++;
            }
            if(i != 0) {
                wCnt[i] += wCnt[i-1];
                eCnt[i] += eCnt[i-1];
            }
        }

        int ans = 0;
        for(int i=0; i<n; i++) {
            if(i == 0) {
                ans = eCnt[n-1] - eCnt[0];
            } else {
                ans = Math.min(ans, wCnt[i-1] + (eCnt[n-1] - eCnt[i]));
            }
        }
        System.out.println(ans);
    }
}
