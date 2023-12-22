import java.util.Scanner;

class Main {
  public static void main(String args[]) {
        Scanner scanner1 = new Scanner(System.in);
       
        int N = scanner1.nextInt();
        int M = scanner1.nextInt();
        int C = scanner1.nextInt();
        
        int B[] = new int[M];
        int A[][] = new int[N][M];
        
        for(int i = 0;i < M;i++){
        	B[i] = scanner1.nextInt();
        }
        for(int i = 0;i < N;i++){
        	for(int j = 0;j < M;j++){
        		A[i][j] = scanner1.nextInt();
        	}
        }
        
        int count = 0;
        int sum = 0;
        for(int i = 0;i < N;i++){
        	sum = 0;
        	for(int j = 0;j < M;j++){
        		sum = sum + A[i][j]*B[j];
        	}
        	sum = sum+C;
        	if(sum > 0){
        		count++;
        	}
        }
        System.out.println(count);
  }
}