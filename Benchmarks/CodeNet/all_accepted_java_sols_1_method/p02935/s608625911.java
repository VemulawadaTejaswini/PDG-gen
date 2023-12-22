import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int N=scan.nextInt();
    Double[] v=new Double[N];
    for(int i=0;i<N;i++){
      v[i]=scan.nextDouble();
    }
    Arrays.sort(v);
    double ans=v[0];
    for(int i=0;i<N;i++){
      ans=(double)(v[i]+ans)/2;
    }
    System.out.println(ans);
  }
}