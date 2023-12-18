import java.util.Scanner;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
      int N = in.nextInt();
      int K = 0;
      for (int i = 0; i<N; i++){
      int R = in.nextInt();
      if (i%2==1 && R%2==1){
        K = K +1;
      }
      }
      System.out.print(K);
      }
}