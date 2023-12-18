import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        var sc = new Scanner(System.in);
    
        int n = Integer.parseInt(sc.next());
        String c = sc.next();
    
        int r2 = -1;
        int w2 = -1;
        for(int i = 1; i <= n; i++){
            if(c.charAt(i-1) == 'R'){
                r2 = i;
            }else{
                if(w2 == -1){
                    w2 = i;
                }
            }
        }
        if(r2 == -1 || w2 == -1){
            System.out.println(0);
            return;
        }
        var r = new int[n+1];
        var w = new int[n+1];
        for(int i = 1; i <= n; i++){
            if(c.charAt(i-1) == 'R'){
                if(i < w2){
                    r[i] = r[i-1];
                }else{
                    r[i] = r[i-1] +1;
                }
                w[i] = w[i-1];
            }else{
                r[i] = r[i-1];
                if(r2 < i){
                    w[i] = w[i-1];
                }else{
                    w[i] = w[i-1] +1;
                }
            }
        }
        
        int ans = n;
        for(int i = 0; i < n; i++){
            int a = Math.max(r[n] - r[i], w[i]);
            ans = Math.min(a, ans);
        }
        System.out.println(ans);
    }
}