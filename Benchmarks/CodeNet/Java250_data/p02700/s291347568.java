import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int B = scn.nextInt();
        int C = scn.nextInt();
        int D = scn.nextInt();
        
        while(C>0 && A>0){
            C = C-B;
            
            if(C<=0){
                break;
            }
            
            A = A-D;
        }    
          
        if(C<=0){
                System.out.println("Yes");
            }
        else if(A<=0){    
               System.out.println("No");
        }
    }
}