import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int c=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt();
    if(Math.abs(a-c)>Math.abs(b-c)){
      System.out.println("B");
    }else{
      System.out.println("A");
    }
  }
}
