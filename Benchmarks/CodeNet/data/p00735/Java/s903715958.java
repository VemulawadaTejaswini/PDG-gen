import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int[] msn = new int[100000];
    private static int[] msd = new int[100000];
    public static void main(String[] args) throws Exception {
        int msnc = 0;
        int msdc = 0;
        for (int i = 2;i <= 300000;i++) {
            if (i%7==1||i%7==6) {
                msn[msnc] = i;
                boolean b = true;
                for (int j = 0;j < msnc;j++) {
                    if (i%msn[j]==0) {
                        b = false;
                        break;
                    }
                }
                if (b) {
                    msd[msdc] = i;
                    msdc++;
                }
                msnc++;
            }
        }
        
        while (true) {
            int n = sc.nextInt();
            if (n==1) break;
            solve(n);
        }
    }
    
    private static void solve(int val) {
        StringBuilder sb = new StringBuilder();
        sb.append(val).append(":");
        for (int i = 0;i < 100000;i++) {
            int n = msd[i];
            if (n!=0) {
                if (val%msd[i]==0) {
                    sb.append(" ").append(msd[i]);
                }
            }
        }
        System.out.println(sb.toString());
    }
}