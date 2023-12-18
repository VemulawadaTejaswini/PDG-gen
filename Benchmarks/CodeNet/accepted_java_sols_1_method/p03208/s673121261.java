import java.util.Scanner;
import java.util.Arrays;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] h = new int[N];

    for(int i = 0;i < N;i++){
       h[i] = sc.nextInt();
    }
    Arrays.sort(h);
    
    int min = h[N - 1] - h[0];
    for(int i = 0;i < N - K + 1;i++){
      if(min > h[i + K - 1] - h[i]){
        min = h[i + K - 1] - h[i];
      }
    }

    System.out.println(min);
  }
}
