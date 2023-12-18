import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[][] a = new int[n-2][n-2];
        int ans = (n-2)*(n-2);
        for (int i=0;i<q;i++) {
            int q1=sc.nextInt();
            int q2=sc.nextInt();
            if (q1==1) {
                for (int j=0;j<(n-2);j++) {
                    if (a[q2-2][j]==0) {
                        a[q2-2][j]=1;
                        ans--;
                    } else {
                        break;
                    }
                }
            } else {
                for (int j=0;j<(n-2);j++) {
                    if (a[j][q2-2]==0) {
                        a[j][q2-2]=1;
                        ans--;
                    } else {
                        break;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
