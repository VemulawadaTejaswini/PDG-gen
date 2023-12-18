import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int x=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt();
    if(b-a<=0){
      System.out.println("delicious");
    }else if(b-a<=x){
      System.out.println("safe");
    }else{
      System.out.println("dangerous");
    }
  }
}
