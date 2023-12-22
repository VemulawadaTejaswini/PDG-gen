import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int a=sc.nextInt(),b=sc.nextInt();
    if((a!=1&&a<b)||(b==1&&b<a)){
      System.out.println("Bob");
    }else if(a==b){
      System.out.println("Draw");
    }else{
      System.out.println("Alice");
    }
  }
}
