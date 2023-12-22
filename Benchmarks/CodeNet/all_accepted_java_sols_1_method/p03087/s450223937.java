import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        char[] arr = s.toCharArray();

        int[][] lr = new int[q][2];
        for (int i=0; i<q; i++) {
            lr[i][0] = sc.nextInt()-1;
            lr[i][1] = sc.nextInt()-1;
        }

        int[] flag = new int[n+1];

        for (int i=0; i<n-1; i++){
            if (arr[i]=='A'){
                if (arr[i+1]=='C'){
                    flag[i+1] = 1;
                }
            }
        }

        int[] cnt = new int[n+2];
        for (int i=0; i<n; i++){
            cnt[i+1] = cnt[i]+flag[i];
        }

//        for (int i=0; i<n+1; i++)System.out.print(cnt[i]);

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<q; i++){
            int l = lr[i][0];
            int r = lr[i][1];

            sb.append((cnt[r+1]-cnt[l+1])+"\n");
        }

        System.out.println(sb.toString());

    }
}
