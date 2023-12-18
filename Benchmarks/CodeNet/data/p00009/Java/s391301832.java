import java.util.*;

class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                boolean[] list = primeList(999999);
                while(sc.hasNext()){
                        int n = sc.nextInt();
                        System.out.println(primeNumber(n, list));
                }   
                sc.close();
        }   
        static boolean[] primeList(int n){
                boolean[] notprime = new boolean[n+1];
                for(int i = 2; i <= n; i++){
                        if(!notprime[i]){
                                for(int j = 2; j*i <= n; j++){
                                        notprime[j*i] = true;
                                }   
                        }   
                }   
                return notprime;
        }   
        static int primeNumber(int n, boolean[] list){
                int sum = 0;
                for(int i = 2; i <= n; i++){
                        if(!list[i]){
                                sum++;
                        }   
                }   
                return sum;
        }   
}