import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long X[] = new long[N];
    long B[] = new long[N];//整列用
    for(int i=0;i<N;i++){
      X[i]=sc.nextLong();
      B[i]=X[i];
    }
    Arrays.sort(B);
    //いったん真ん中を出す
    double med = B[N/2]+B[N/2-1];
    med=med/2;
    for(int i=0;i<N;i++){
      if(X[i]<med){
        System.out.println(B[N/2]);
      }else if(X[i]>med){
        System.out.println(B[N/2-1]);
      }else{
        System.out.println(X[i]);
      }
    }
    
  }
  

  
}