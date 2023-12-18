import java.util.*;

class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                String[] s = {"deficient number", "perfect number", "abundant number"};
                int n = sc.nextInt();
                while(n != 0){ 
                        n -= getS(n);
                        String out = ""; 
                        if(n < 0){ 
                                out = s[2];
                        }else if(n == 0){ 
                                out = s[1];
                        }else{
                                out = s[0];
                        }   
                        System.out.println(out);
                        n = sc.nextInt();
                }   
        }   
        static int getS(int n){
                int s = 0;
                for(int i = 1; i < n; i++){
                        if(n%i == 0){ 
                                s += i;
                        }   
                }   
                return s;
        }   
}