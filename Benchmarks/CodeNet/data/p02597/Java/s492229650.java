import java.util.*;

class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        char[] c = new char[n];
        for(int i = 0; i < n; i++) c[i] = s.charAt(i);
        int out1 = 0;
        int cw = 0;
        for(int i = 0; i < n; i++){
            if(c[i] == 'W') cw++;
        }
        if(cw == 0 || cw == n){
            System.out.println(0);
            return;
        }
        out1 = Math.min(cw, n - cw);
        int out2 = 0;
        int w = 1;
        for(int i = 1; i < n; i++){
            if(c[i - 1] == 'W' && c[i] == 'W') w++;
            else{
                if(c[i - 1] != 'R' && c[i] == 'R') w = 0;
                int r = 0;
                for(int j = n - 1; j >= i; j--){
                    if(c[j] == 'R'){
                        r++;
                        c[j] ='W';
                        c[i - 1] = 'R';
                    }
                    if(r >= w) break;
                }
                out2 += r;
                w = 1;
            }
        }
        System.out.println(Math.min(out1, out2));
        scan.close();
    }
    public static void main(String[] args){
        new Main().solve();
    }
}
