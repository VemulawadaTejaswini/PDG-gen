import java.io.*;
public class Main {
        public static void main(String[] args) throws IOException {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                String is; 
                while((is = in.readLine()) != null){
                        int a = Integer.parseInt(is);
                        int c = 0;
                        for(int i = 1;i <= a/2; ++i){
                                if(isPrime(i) && isPrime(a+1-i)){
                                        ++c;
                                }   
                        }   
                        c *= 2;
                        if(a%2 != 0){ 
                                if(isPrime((a+1)/2)){
                                        ++c;
                                }   
                        }   
                        System.out.println(c);
                }   
        }

        static boolean isPrime(int n){ 
                if(n < 2){ 
                        return false;
                } else if(n == 2){ 
                        return true;
                }   
                if(n % 2 == 0){ 
                        return false;
                }   
                for(int i = 3; i*i <= n; i+=2){
                        if(n % i == 0){ 
                                return false;
                        }   
                }
                return true;
        }
}