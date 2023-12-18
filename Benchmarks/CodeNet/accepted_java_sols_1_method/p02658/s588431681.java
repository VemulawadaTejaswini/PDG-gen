import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      long[] a=new long[N];
      long x=1;
      for(int i=0;i<N;i++){
      	a[i]=sc.nextLong();
       if(a[i]==0){
       	System.out.println(0);
         return;
       }
      }
      for(int i=0;i<N;i++){
      	if(a[i]<=1000000000000000000L/x){
       	x=x*a[i];
       }else{
       	System.out.println(-1);
         return;
       }
      }
      if(x<=1000000000000000000L){
      	System.out.println(x);
        return;
      }else{
      	System.out.println(-1);
        return;
      }
	}
}