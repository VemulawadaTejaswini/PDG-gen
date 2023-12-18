import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] s = new int[100001];
        int[] e = new int[100001];
        int[][] ca = new int[c][100001];
        for (int i = 0; i < n; i++) {
            int sd = sc.nextInt();
            int ed = sc.nextInt();
            int cd = sc.nextInt()-1;
            if(ca[cd][sd] < 0){
                e[sd]--;
            }else{
                s[sd-1]++;
                ca[cd][sd]++;
            }
            if(ca[cd][ed] > 0){
                s[ed-1]--;
            }else{
                e[ed]++;
                ca[cd][ed]--;
            }
        }

        int ans = 0;
        int cnt = 0;
        for (int i = 0; i < 100001; i++) {
            cnt += s[i];
            cnt -= e[i];
            if(ans < cnt) ans = cnt;
        }
        System.out.println(ans);
        sc.close();

    }

}
