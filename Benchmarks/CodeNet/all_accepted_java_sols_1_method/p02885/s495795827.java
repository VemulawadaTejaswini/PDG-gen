import java.util.*;

public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   
    int A = sc.nextInt();
    int B = sc.nextInt();
    
    int C = B*2;
        
    if(A>C){
    	System.out.println(A-C);
    }else{
    	System.out.println(0);
    }
        
    }
}