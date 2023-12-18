import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    int n=0;
    int a[] =new int[N];
    for(int i=0;i<N;i++){
      a[i]=sc.nextInt();
    n =n+a[i];}
    n=n/N;
    int b[] =new int[N];
    for(int j=0;j<N;j++){
      b[j]=n-a[j];
      while(b[j]<0){b[j]=b[j]+(n-1)*2;}
    System.out.println(b[j]);}
  }
}