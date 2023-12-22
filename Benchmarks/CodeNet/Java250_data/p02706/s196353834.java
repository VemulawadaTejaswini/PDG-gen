import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); //夏休み日数
    int M = sc.nextInt(); //宿題個数
    int[] A = new int[M]; //宿題遂行必要日数
    for(int i=0; i<M; i++) {
      A[i] = sc.nextInt();
      N-=A[i];
      if(N>=0) {
        continue;
      } else {
        break;
      }
    }
     if(N>=0) {
       System.out.println(N);
     } else if(N<0) {
       System.out.println(-1);
     }
  }
}