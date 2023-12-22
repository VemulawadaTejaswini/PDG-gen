import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int[] ans = new int[s.length];
        int rcnt = 1;
        for(int i = 1; i < s.length; i++){
            if(s[i] == 'R'){
                rcnt += 1;
            }else{
                ans[i-1] += rcnt/2 + rcnt%2;
                ans[i] += rcnt/2;
                rcnt = 0;
            }
        }
        int lcnt = 1;
        for(int i = s.length-2; i >= 0; i--){
            if(s[i] == 'L'){
                lcnt += 1;
            }else{
                ans[i+1] += lcnt/2 + lcnt%2;
                ans[i] += lcnt/2;
                lcnt = 0;
            }
        }
        for(int a : ans){
            System.out.print(a + " ");
        }
    }
}
