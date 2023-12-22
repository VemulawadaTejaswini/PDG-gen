import java.util.*;
public class Main {

    public static void main(String[] args) {
     
        Scanner entrada=new Scanner(System.in);
        int A=entrada.nextInt();
        int B=entrada.nextInt();
        int C=entrada.nextInt();
       int variable=0;
       int count=0;
       
     if(A<=B){
        while(variable+A<=B){
            
            variable+=A;  
            count++;
           
        }
    
       if(count>C){
           System.out.println(C);
           
       }else if(count==C){
           
           System.out.println(count);
       }
       else if(count<C){
         
           System.out.println(count);
       }
     }else if(A>B){
         System.out.println("0");
     }     
    
        
    }
    
}
