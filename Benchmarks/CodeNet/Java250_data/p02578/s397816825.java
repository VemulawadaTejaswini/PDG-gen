import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for(int i = 0;i<N;i++){
      A[i]=sc.nextInt();
    }
    long sum = 0;
    int Kijun = 0;
    for(int i2=0;i2<N-1;i2++){
      Kijun = A[i2];
      if(A[i2+1]<Kijun){
        sum+=(long)(Kijun-A[i2+1]);
        A[i2+1]=Kijun;
      }
    }
    System.out.println(sum);
  }
}