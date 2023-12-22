import java.util.Scanner;
 
class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int A[] = new int[2*N];
    int x[] = new int[N];
    for(int a = 0; a < N; a++){
      A[a] = scanner.nextInt();
    }
    for(int a = N; a < 2*N; a++){
      A[a] = A[a-N];
    }
    int temp = 0;
    for(int i = 0; i < N; i++){
      if(i%2 == 0){
        temp += A[i];
      }else{
        temp -= A[i];
      }
    }
    x[0] = temp;
    for(int i = 1; i < N; i++){
      x[i] = 2*A[i-1]-x[i-1];
    }    
    for(int i = 0; i < N; i++){
      System.out.print(x[i]+" ");
    }    
    
  }
}