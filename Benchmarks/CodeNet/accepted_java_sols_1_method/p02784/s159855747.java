import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int H =sc.nextInt();
        int N =sc.nextInt();
        
        int A =0;
        
        for(int i=0;i<N;i++){
            A +=sc.nextInt();
        }
        
        if(H<=A){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
    
    
}
