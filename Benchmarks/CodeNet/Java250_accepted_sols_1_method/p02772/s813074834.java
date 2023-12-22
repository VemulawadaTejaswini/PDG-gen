import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        Scanner sc = new Scanner(System.in);        
        String Ns = sc.next();

	    int N = Integer.parseInt(Ns);

        
        int A[] = new int[N];
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }
        
        for(int i=0; i<N; i++){
    	    if((A[i]%2)==0){
    	       if((A[i]%3)==0 || (A[i]%5)==0){
    	           
    	       }else{
                   System.out.println("DENIED");
    	           return ;
    	       }
    	    }
	    }
        System.out.println("APPROVED");
    }
}