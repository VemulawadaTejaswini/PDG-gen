import java.util.Scanner;
import java.util.Arrays;
public class Main {
  public static void main (String[]args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int stage = N;
    int di[] = new int[N];

    for(int i = 0; i<N; i++){ //とりあえず配列に全部代入
      di[i] = sc.nextInt();
    }

    Arrays.sort(di);//ソート（昇順）

    for(int i =0; i<N; i++ ) {
      if(i != N-1) {
        if(di[i] == di[i+1]){
          stage--;
        }
      }
    }
    System.out.println(stage);
  }
}
