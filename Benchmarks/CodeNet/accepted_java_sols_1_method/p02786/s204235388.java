import java.util.*;

public class Main{
  public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
    Long H=sc.nextLong();
    Long heaviness=1L;
    Long count=0L;
    
    while(H>1){
      H=H/2;
      count+=heaviness;
      heaviness*=2;
    }
    
    count+=heaviness;
    System.out.println(count);
  }
}