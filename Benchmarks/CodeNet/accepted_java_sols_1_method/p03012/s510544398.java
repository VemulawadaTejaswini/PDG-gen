import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int sumleft = 0;
    int sumright = 0;
    int array[] = new int[N];
    for (int i=0;i<N;i++){
     int W = sc.nextInt();
     sumright += W;
     array[i] = W;
    }
    int ans = Math.abs(sumright-sumleft);
    for (int j=0;j<N;j++){
      sumleft += array[j];
      sumright -= array[j];
      ans = Math.min(ans, Math.abs(sumright-sumleft));
    }
    System.out.println(ans);
  }
}
  