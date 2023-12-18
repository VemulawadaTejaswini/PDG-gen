import java.util.Scanner;
  public class Main {
    public static void main(String[] args) {
     
        //sec--1 (definition)
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
		int[] A = new int[N];
      	for(int i=0; i<N; i++) {
          A[i] = sc.nextInt();
        }
        
        //sec--2 (calc)
        for(int i=0; i<N; i++) {
          A[i+1] *= A[i] ;
        }
    }
  }