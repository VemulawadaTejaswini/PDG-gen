import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X[] = new int[N];
    for(int i=0;i<N;i++){
      X[i]=sc.nextInt();
    }
    int P[] = new int[100];
    for(int i=1;i<=100;i++){
      for(int j=0;j<N;j++){
        P[i-1]=P[i-1]+(i*i-2*i*X[j]+X[j]*X[j]);
      }
    }
    Arrays.sort(P);
    System.out.println(P[0]);
  }
  

  
}