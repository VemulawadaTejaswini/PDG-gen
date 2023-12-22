import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N =sc.nextInt();
    int A[] =new int [N];
    for(int i=0;i<N;i++){
      A[i]=sc.nextInt();}
    int z=0;
      for(int k=0;k<N;k++){
        z=z+(A[k])*(A[k]);}
    int x=0;
    for(int j=1;j<=100;j++){
      int y=0;
      for(int m=0;m<N;m++){
        y=y+(A[m]-j)*(A[m]-j);}
      z=Math.min(z,y);
      if(z==y){x=y;}}
    System.out.println(x);
  }
}