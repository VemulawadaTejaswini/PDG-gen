import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] L = new int[M];
        int sum = 0;
        for(int i = 0; i < M; i++){
          L[i] = sc.nextInt();
          sum += L[i];
        }
        if(sum > N){
          System.out.println("-1");
        }
        else{
          System.out.println(N - sum);
        }
      }
}
