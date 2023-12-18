import java.util.*;
public class Main{
  	public static void main(String[] args){
      Scanner sc =new Scanner(System.in);
     
      int N=sc.nextInt();
      int a[];
      a=new int[101];
      for (int i=1;i<N+1;i++){
        a[i]=sc.nextInt();
      }
      
      int step=0;
      int m=(N+1)/2;
      int k=0;
      for (int i=1;i<m+1;i++){
        k=2*i-1;
        if(a[k]%2==1){
        step=step+1;
        }
      }
 
      System.out.println(step);
    }
}