import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	long a=sc.nextLong(),v=sc.nextLong(),b=sc.nextLong(),w=sc.nextLong(),t=sc.nextLong();
    if(a<b){
      if((a+v*t)<(b+w*t)){
        System.out.println("NO");
      }else{
        System.out.println("YES");
      }
    }else{
      if((a+v*t)>(b+w*t)){
        System.out.println("NO");
      }else{
        System.out.println("YES");
      }
    }
  }
}
