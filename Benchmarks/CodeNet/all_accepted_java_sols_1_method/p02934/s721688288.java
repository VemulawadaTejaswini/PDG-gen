import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int N=scan.nextInt();
    int[] A=new int[N];
    double ans=0;
    double tmp=0;
    for(int i=0;i<N;i++){
      A[i]=scan.nextInt();
      tmp+=(double)1/A[i];
    }
    ans=1/tmp;
    System.out.println(ans);
  }
}