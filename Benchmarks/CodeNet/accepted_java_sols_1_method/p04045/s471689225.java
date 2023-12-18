import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        String[] strs = N.split("");
        int[] sp = new int[strs.length];
        
        for(int i=0; i<strs.length; i++) {
            sp[i] = Integer.parseInt(strs[i]);
        }
        
        int n = Integer.parseInt(N);
        int k = Integer.parseInt(sc.next());
        int[] d = new int[10];
        for(int i=0; i<k; i++) {
            int x = Integer.parseInt(sc.next());
            d[x] = 1;
        }
        
        int ans = 0;
        boolean isequal = true;
        for(int i=0; i<sp.length; i++) {
            if(isequal) {
                if(d[sp[i]] == 0) {
                    ans = ans*10+sp[i];
                }else {
                    isequal = false;
                    for(int j=sp[i]; j<=9; j++) {
                        if(d[j] == 0) {
                            ans = ans*10+j;
                            break;
                        }
                        if(i == 9) {
                            ans = ans*10;
                        }
                    }
                } 
            }else {
                for(int j=0; j<=9; j++) {
                    if(d[j] == 0) {
                        ans = ans*10+j;
                        break;
                    }
                }
            }
        }
        if(ans >= n) {
            System.out.println(ans);
        }else {
            ans = 0;
            for(int i=0; i<sp.length+1; i++) {
                for(int j=0; j<=9; j++) {
                    if(i==0 && j==0) continue;
                    
                    if(d[j] == 0) {
                        ans = ans*10+j;
                        break;
                    }
                }
            }
            System.out.println(ans);
        }
        
    }   
}