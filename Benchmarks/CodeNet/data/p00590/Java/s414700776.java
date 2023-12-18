import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int[] prime;
    public static void main(String[] args) {
        makePrime();
        while(read()){
            solve();
        }
    }

    static void makePrime(){
        prime = new int[10001];
        for(int i = 2; i < prime.length; i++){
            prime[i] = 1;
        }
        for(int i = 2; i < prime.length; i++){
            if(prime[i] == 1){
                for(int j = 2*i; j < prime.length; j+= i){
                    prime[j] = 0;
                }
            }
        }/*
        for(int i = 9000; i < 10000; i++){
            if(prime[i] == 1)System.out.print(i+" ");
        }
        System.out.println();
        */
    }

    static boolean read(){
        n = sc.nextInt();
        if(n == 0)return false;
        return true;
    }

    static void solve(){
        int res = 0;
        int[] increasing = new int[n+1];
        int[] decreasing = new int[n+1];
        for(int i = 0; i < increasing.length; i++){
            increasing[i] = i;
        }
        for(int i = 0; i < decreasing.length; i++){
            decreasing[i] = decreasing.length - i ;
        }
        for(int i = 0; i < increasing.length; i++){
            if(isPrime(increasing[i]) == true && isPrime(decreasing[i]) == true){
                res++;
            }
        }
        /*
        for(int i = 0; i < increasing.length; i++){
            System.out.print(increasing[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < decreasing.length; i++){
            System.out.print(decreasing[i] + " ");
        }
        System.out.println();
        */
        System.out.println(res);
    }

    static boolean isPrime(int in){
        if(prime[in] == 1){
            return true;
        }else{
            return false;
        }
    }
}