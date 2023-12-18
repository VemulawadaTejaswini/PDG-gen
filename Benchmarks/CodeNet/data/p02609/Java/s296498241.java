import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),f=0;
    long sum=0;
    String str=sc.next();
    char[] c=str.toCharArray();
    for(int i=0;i<n;i++){
      if(c[i]=='1'){
        f++;
        sum+=(long)Math.pow(2,n-i-1);
      }
    }
    
    long d,dsum;
    for(int i=0;i<n;i++){
      long ans=0;
      char[] fc=str.toCharArray();
      d=(long)f;
      dsum=sum;
      if(fc[i]=='1'){
        d--;
        dsum-=(long)Math.pow(2,n-i-1);
      }else{
        d++;
        dsum+=(long)Math.pow(2,n-i-1);
      }
      while(dsum>0){
        dsum=dsum%d;
        d=0;
        long e=dsum;
        while(e>0){
          if(e%2==1){
            d++;
          }
          e/=2;
          
        }
        ans++;
      }
      System.out.println(ans);
    }
  }
}
