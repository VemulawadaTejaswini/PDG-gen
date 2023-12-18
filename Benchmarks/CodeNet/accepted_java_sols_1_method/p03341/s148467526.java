import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        long ans = Long.MAX_VALUE;
        int[] WL = new int[n];
        int[] EL = new int[n];
        for(int i = 0; i < n; i++){
            if(s[i] == 'E'){
                EL[i]++;
            }else{
                WL[i]++;
            }
            if(i != 0){
                WL[i] += WL[i-1];
                EL[i] += EL[i-1];
            }
        }
        for(int i = 0; i < n; i++){
            if(i == 0){
                ans = Math.min(ans,EL[n-1] - EL[i]);
            }else{
                ans = Math.min(ans,WL[i-1] + EL[n-1] - EL[i]);
            }
        }
        System.out.println(ans);
    }
}
