import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int A =sc.nextInt();
        int B =sc.nextInt();
        int C =sc.nextInt();
        int D =sc.nextInt();
        
        
        
        int sw =0;
        
        while(A>0 &&C>0){
            
            if(sw==0&&C>=0){
                C=C-B;
                sw =1;
            }else if(sw==1&&A>=0){
                A = A-D;
                sw =0;
            }
            
        }
        
        if(A<=0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
        
        
    }
    
    
}
