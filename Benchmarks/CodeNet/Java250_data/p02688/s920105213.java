import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt(), K=sc.nextInt(), d, e, t=0;
    int A[]= new int[N];
    for(int i=0; i<K; i++){
      d=sc.nextInt();
      for(int j=0; j<d; j++){
        e=sc.nextInt();
        A[e-1]++;
      }
    }
    for(int k=0; k<N; k++){
      if(A[k]==0) t++;
    }
    System.out.println(t);
  }
}