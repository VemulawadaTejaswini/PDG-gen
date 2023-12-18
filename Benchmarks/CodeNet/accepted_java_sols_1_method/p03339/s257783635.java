import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int[] wcnt = new int[n];
        int[] ecnt = new int[n];
        for(int i = 0; i < n; i++){
            char chk = s[i];
            if(chk == 'W'){
                wcnt[i]++;
            }else{
                ecnt[i]++;
            }
            if(i != 0){
                wcnt[i] += wcnt[i-1];
                ecnt[i] += ecnt[i-1];
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(i == 0){
                ans = Math.min(ans,ecnt[n-1]-ecnt[i]);
            }else{
                ans = Math.min(ans,wcnt[i-1] + ecnt[n-1]-ecnt[i]);
            }
        }
        System.out.println(ans);
    }
}
