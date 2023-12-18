import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static boolean[] prime = new boolean[10000001];
    static boolean[] d = new boolean[10000001];
    public static void main(String[] args) {
        makePrime();
        while(read()){
            solve();
        }
    }

    static void makePrime(){
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for(int i = 2; i < prime.length; i++){
            if(prime[i]){
                for(int j = i*2; j < prime.length; j += i)prime[j] = false;
            }
        }
        Arrays.fill(d, false);
        for(int i =  5; i <= prime.length-9; i+=2){
            if(prime[i]&&prime[i+2]&&prime[i+6]&&prime[i+8])d[i+8] = true;
        }
    }

    static boolean  read(){
        n = sc.nextInt();
        if(n == 0)return false;
        return true;
    }

    static void solve(){
        int res = 0;
        for(int i = 0; i <= n; i++){
            if(d[i]){
                res = Math.max(res, i);
            }
        }
        System.out.println(res);
    }

}