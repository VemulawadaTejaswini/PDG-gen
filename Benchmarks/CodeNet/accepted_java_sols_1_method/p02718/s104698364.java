import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    double M=sc.nextInt();
    int[] A=new int[N];
    int counter=0;
    double total=0;
    for(int i=0;i<N;i++){
      A[i]=sc.nextInt();
      total+=A[i];
    }
    double cap=total/(4.0*M);
    for(int i=0;i<N;i++){
      if(A[i]>=cap) counter++;
    }
    if(counter<M) System.out.println("No");
    else System.out.println("Yes");
  }
}