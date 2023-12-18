import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int A =sc.nextInt();
    int B =sc.nextInt();
    int M =sc.nextInt();
    int a[] =new int[A];
    int b[] =new int[B];
    int m[] =new int[3*M];
    int x=100000;int y=100000;
    for(int i=0;i<A+B;i++){
      if(i<A){a[i]=sc.nextInt();
             x=Math.min(a[i],x);}
      else{b[i-A]=sc.nextInt();
          y=Math.min(y,b[i-A]);}}
    int z=x+y;
    for(int j=0;j<M;j++){
      m[3*j]=sc.nextInt();
      m[3*j+1]=sc.nextInt();
      m[3*j+2]=sc.nextInt();
      z=Math.min(a[m[3*j]-1]+b[m[3*j+1]-1]-m[3*j+2],z);}
    System.out.println(z);
  }
}