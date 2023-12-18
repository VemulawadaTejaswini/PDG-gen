import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=Integer.parseInt(sc.next()),f=0;
    long[] a=new long[n];
    long sum=0;
    for(int i=0;i<n;i++){
      a[i]=Long.parseLong(sc.next());
      if(a[i]>=Math.pow(2,i)){
        System.out.println(-1);
        f++;
        break;
    }
    if(f==0){
      
  }
}
