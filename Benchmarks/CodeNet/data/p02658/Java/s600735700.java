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
        int output = 0;
      
        //sec--2 (calc)
        for(int i=0; i<=N; i++) {
          output *= A[i];
          if (output <= Math.pow(10, 18)) {
            System.out.println("-1");
          } else if (output > Math.pow(10, 18))
            System.out.println(output);
        }
        
        
    }
  }