import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long [201000];
        for(int i =0; i < N; i++) A[i] = sc.nextLong();
        long humidai = 0;
        for(int i = 0; i < N - 1; i++){
          if(A[i] > A[i + 1]){
            humidai += (A[i] - A[i +1]);
            A[i+1] = A[i];
          }
        }
      System.out.println(humidai);
    } 
}