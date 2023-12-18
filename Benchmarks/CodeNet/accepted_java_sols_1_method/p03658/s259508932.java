import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] l = new int[ N ];
    for(int i =  0 ;i < N ;i ++){
      l[ i ] = sc.nextInt();
    }
    Arrays.sort(l);

    int result = 0 ;
    for(int i = 0 ;i < K ;i ++){
      result = result + l[ N - i - 1];
    }
    System.out.println(result);
  }
}
