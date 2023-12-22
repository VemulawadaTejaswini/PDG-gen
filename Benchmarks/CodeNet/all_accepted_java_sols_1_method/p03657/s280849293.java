import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int a=sc.nextInt(),b=sc.nextInt(),c=a+b;
    if(a*b*c%3==0){
      System.out.println("Possible");
    }else{
      System.out.println("Impossible");
    }
  }
}
