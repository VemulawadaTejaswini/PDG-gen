import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] s = S.split("");
        int[] n = new int[4];
        for(int i = 0; i < 4; i++) {
            n[i] = Integer.parseInt(s[i]);
        }
        
        String ans;
        if(1 <= n[1] && n[0]*10+n[1] <= 12 && 1 <= n[3] && n[2]*10+n[3] <= 12) {
            ans = "AMBIGUOUS";
        }else if(1 <= n[1] && n[0]*10+n[1] <= 12) {
            ans = "MMYY";
        }else if(1 <= n[3] && n[2]*10+n[3] <= 12) {
            ans = "YYMM";
        }else {
            ans = "NA";
        }
        
        System.out.println(ans);
    }
}