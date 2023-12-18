import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int M = sc.nextInt();
    int a[] = new int[A];
    int b[] = new int[B];
    
    int amin = 1000000;
    int bmin = 1000000;
    //Aのなかで最安値を求める
    for(int i=0; i<A; i++){
      a[i]=sc.nextInt();
      if(a[i]<amin){
        amin=a[i];
      }
      }
    //Bのなかで最安値を求める
    for(int i= 0;i<B;i++){
      b[i]=sc.nextInt();
      if(b[i]<bmin){
        bmin=b[i];
      }
      }
    
    int[] x  = new int[M];
    int[] y  = new int[M];
    int[] c  = new int[M];
    
    for(int i=0; i<M; i++){
      x[i]=sc.nextInt();
      y[i]=sc.nextInt();
      c[i]=sc.nextInt();
    }
    
    int price = amin + bmin;
    int dis;
    
    for(int i=0; i<M; i++){
      dis = a[x[i]-1] + b[y[i]-1] -c[i];//要素数は「0」スタート
      if(dis < price){
       price = dis; 
      }
      }
    System.out.println(price);
    sc.close();
  }
}