import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int Q = scanner.nextInt();
        
        int [] A = new int [Q];
        int [] B = new int [N];
        
        for(int i =0; i<Q; i++){
            A[i] = scanner.nextInt()-1;
            B[A[i]]+=1;
        }
        
        for (int l=0; l<N; l++){
            if(B[l]+K-Q>0){
            System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        } 
   }        
}