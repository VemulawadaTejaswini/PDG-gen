import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      if(a>0)System.out.println("Positive");
      else if(b>=0)System.out.println("Zero");
      else{
      	if(a==0)System.out.println("Zero");
        else if((b-a+1)%2==0)System.out.println("Positive");
        else System.out.println("Negative");
      }
    }
}