import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int n = s.length();

        boolean[] stone = new boolean[s.length()];
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'B'){
                stone[i] = true;
            }else{
                stone[i] = false;
            }
        }

        long ans = 0;
        for(int i=0; i<n; i++){
            if(stone[i]){
                long wnum = 0;
                for(int j=i+1; j<n; j++){
                    if(!stone[j]) wnum++;
                }
                for(int j=i+1; j<n; j++){
                    if(!stone[j]) ans += j-i;
                }
                if(wnum > 0) ans -= (wnum-1) * (wnum) / 2; 
                break;
            }
        }

        System.out.println(ans);
    }
}