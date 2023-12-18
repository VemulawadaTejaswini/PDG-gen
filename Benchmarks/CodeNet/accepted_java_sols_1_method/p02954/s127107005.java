import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int n = s.length;
        int rstart = -1;
        int lstart = -1;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            if(s[i] == 'R'){
                if(rstart < 0){
                    rstart = i;
                    if(0 < lstart){
                        int x = i-lstart;
                        int y = x/2;
                        ans[lstart-1] += y;
                        ans[lstart] += x-y;
                        lstart = -1;
                    }
                }
            }else{
                if(lstart < 0){
                    lstart = i;
                    int x = i - rstart;
                    int y = x/2;
                    ans[i] += y;
                    ans[i-1] += x-y;
                    rstart = -1;
                }
            }
        }
        int x = n-lstart;
        int y = x/2;
        ans[lstart-1] += y;
        ans[lstart] += x-y;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(ans[i] + " ");
        }
        System.out.println(sb.toString());
        sc.close();

    }

}
