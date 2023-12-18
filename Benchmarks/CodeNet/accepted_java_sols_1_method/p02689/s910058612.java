import java.util.Scanner;
public class Main {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] H = new int[(int)N];
        int[] A = new int[2];
        int ans = 0;
        
        int[] C = new int[(int) N];
        for(int i = 0; i < N ; i++){
            C[i] = 1;
        }
        
        for(int i = 0 ; i < N ; i++){
                H[i] = sc.nextInt(); 
        }
        
        
        for(int n = 0; n < M ; n++){
            A[0] = sc.nextInt();
            A[1] = sc.nextInt();
            if(H[A[0] - 1] == H[A[1] - 1]){
                C[A[0] - 1] = 0;
                C[A[1] - 1] = 0;
            }else if(H[A[0] - 1] < H[A[1] - 1]){
                C[A[0] - 1] = 0;
            }else{
                C[A[1] - 1] = 0;
            }
            
        }
        
        for(int i = 0; i < N ;i++){
            ans = ans + C[i];
        }        
        System.out.println(ans);
    
    }
}
