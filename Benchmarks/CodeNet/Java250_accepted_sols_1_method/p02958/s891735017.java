
import java.util.*;







// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class Main{
    public static void main(String args[] ) throws Exception {
        
        //Scanner
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for(int i=0;i<n;i++) {
            A[i] = scanner.nextInt();
        }
        int[] sorted = new int[n];
        for(int i=0;i<n;i++) {
            sorted[i] = i+1;
        }
        for(int i=0;i<n;i++) {
            if(A[i]!=i+1) {
                int a = A[A[i]-1];
                A[A[i]-1] = A[i];
                A[i] = a;
                break;
            }
        }
        
        
        
        int flag=0;
        for(int i=0;i<n;i++) {
            
            if(A[i]!=sorted[i]) {
                flag=1;
                break;
            }
        }
        if(flag==0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
    
    
    
}
