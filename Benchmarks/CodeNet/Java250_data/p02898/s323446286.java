import java.util.Scanner;
import java.util.Arrays;

class Main{
  static public void main(String args[]){
    Integer N,K,count = 0;
    Scanner sc =new Scanner(System.in);
    N = sc.nextInt();
    K = sc.nextInt();
    int vec[] = new int[N];
    for(int i = 0; i < N; i++){
      vec[i] = sc.nextInt();
    }
    Arrays.sort(vec);
    for(int i = 0; i < N; i++){
      if(vec[i] >= K){
        count ++;
      }
    }
    System.out.print(count);
  }
}
