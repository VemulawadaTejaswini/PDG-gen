import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n, s, res;
    public static void main(String[] args) {
        while(read()){
            solve();
        }
    }
 
    static boolean read(){
        n = sc.nextInt();
        s = sc.nextInt();
        if( n == 0 && s == 0)return false;
        return true;
    }
     
    static void solve(){
        res = 0;
        dfs(0, n, 0);
        System.out.println(res);
    }
	
// dfs(検索する最小の数、足し合わせる数、合計)

    static void dfs(int i, int n, int sum){ 
        if(n == 0){
            if(sum == s)res++;
            return;
        }
         
        if(i > 9)return;
        for(int k = i; k <10; k++){
            dfs(k+1, n-1, sum+k);
        }
    }
}