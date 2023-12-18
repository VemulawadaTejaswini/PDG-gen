import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();

    double prob = 0;
    for( int i=0 ; i < N ; i++ ){
      int pt = i+1 ;//ある得点ptが出たとき
      int times = 0;
      for( int j=0 ; j >= 0 ; j++ ){
        if (pt >= K){break; }//得点がK以上ならば終わり
        else{ pt*=2; }//得点を2倍
        times = j+1;
      }
      prob += 1 / (double)N / ( Math.pow(2, times) ) ;
    }
    System.out.println(prob);
  }
}