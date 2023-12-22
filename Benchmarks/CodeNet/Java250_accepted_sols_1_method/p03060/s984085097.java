import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    int V[] =new int[N];
    int C[] =new int[N];
    int x=0;
    for(int i=0;i<2*N;i++){
      if(i<N){V[i]=sc.nextInt();}
      else{C[i-N]=V[i-N]-sc.nextInt();
           if(C[i-N]>0){x=x+C[i-N];}}}
    System.out.println(x);
  }
}