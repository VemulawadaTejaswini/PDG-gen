import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int employee[] = new int[N];
        
        for(int i=0;i<N-1;i++){
            employee[sc.nextInt()-1]++;    
        }
        
        for(int i=0;i<N;i++){
            System.out.println(employee[i]);
        }
        
        
    }
}
