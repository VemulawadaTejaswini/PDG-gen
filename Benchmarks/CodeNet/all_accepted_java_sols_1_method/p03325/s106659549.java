import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] A = new int [N];
        
        for(int i =0; i<N; i++){
            A[i] = sc.nextInt();
        }
        
        int count =0; 
        
        for(int i=0; i<N; i++){
            while(A[i]%2 == 0){
                A[i] = A[i]/2;
                count++;
            }
        }
        
        System.out.println(count);
    }
}