import java.util.Scanner;
 
class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N-1];
        int M[] = new int[N];
        

        for(int i=0;i<N;i++) {
        	M[i] = 0;
        }
        
        for(int i=0;i<N-1;i++) {
        	A[i] = sc.nextInt();
        }
        
        for(int i=0;i<N-1;i++) {
        	M[A[i]-1] ++;
        }
        
      
        
        for(int i=0;i<N;i++){
        System.out.println(M[i]);
        
        }
	}
}