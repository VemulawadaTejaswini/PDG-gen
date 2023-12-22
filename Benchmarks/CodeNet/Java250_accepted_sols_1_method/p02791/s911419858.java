import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int min = Integer.MAX_VALUE;
    int cnt = 0;
    for(int i=0; i<N; i++){
      int tmp = sc.nextInt();
      if( tmp < min ){
        min = Math.min(min, tmp);
        cnt++;
      }
    }
    System.out.print(cnt);
  }
}
