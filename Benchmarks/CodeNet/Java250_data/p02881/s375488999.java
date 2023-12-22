import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        
       Scanner sc = new Scanner(System.in);
       long num = sc.nextLong();
       
       double root =Math.sqrt(num);
       long a=1;
       long b=1;
       long answer =0;
       
       for (a=1;a<=root;++a) {
            if (num % a == 0) { 
                b = num/a;
                if(a + b -2<answer||answer ==0){
                    answer = a+b-2;
                    
                }
                
            }
        }
        
        System.out.println(answer);
        
        
       
       }
    
}