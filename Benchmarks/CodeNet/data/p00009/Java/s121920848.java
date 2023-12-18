import java.util.*;

class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                while(sc.hasNext()){
                        int n = sc.nextInt();
                        System.out.println(primeN(n));
                }   
                sc.close();
        }   
        static int primeN(int n){
                int sum = 0;
                for(int i = 2; i <= n; i++){
                        if(isPrime(i)){
                                sum++;
                        }   
                }   
                return sum;
        }   
        static boolean isPrime(int n){
                for(int i = 2; i*i <= n; i++){
                        if(n%i == 0){ 
                                return false;
                        }   
                }   
                return true;
        }   
}