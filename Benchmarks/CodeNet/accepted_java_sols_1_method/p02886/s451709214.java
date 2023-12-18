import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] d = new int[N];
    int sum = 0;
    for(int i=0;i<N;i++){
      d[i]=sc.nextInt();
      sum+=d[i];
    }
    int r = 0;
    for(int k=0;k<N-1;k++){
      sum-=d[k];
      r+=d[k]*sum;
    }
    System.out.println(r);
  }
}