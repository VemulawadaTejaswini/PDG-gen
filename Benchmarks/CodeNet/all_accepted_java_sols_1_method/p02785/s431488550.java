import java.util.Scanner;
import java.util.Arrays;


class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int H[] = new int[N];

    for(int i = 0;i < N;i++){
      H[i] = sc.nextInt();
    }
    Arrays.sort(H);

    long S = 0;
    for(int i = 0;i < N-K;i++){
      S += H[i];
    }
    System.out.println(S);
  }

}
