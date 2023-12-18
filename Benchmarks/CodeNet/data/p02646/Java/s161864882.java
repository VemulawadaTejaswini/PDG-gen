import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	long a=sc.nextLong(),v=sc.nextLong(),b=sc.nextLong(),w=sc.nextLong(),t=sc.nextLong();
    
    long g=0;
    for(long i=1;i<=t;i++){
      if(a<b){
        a-=(long)Math.abs(v);
        b-=(long)Math.abs(w);
      }else{
        a+=(long)Math.abs(v);
        b+=(long)Math.abs(w);
      }
      
      if(a==b){
        System.out.println("YES");
        g++;
        break;
      }
    }
    if(g==0){
      System.out.println("NO");
    }
    
  }
}
