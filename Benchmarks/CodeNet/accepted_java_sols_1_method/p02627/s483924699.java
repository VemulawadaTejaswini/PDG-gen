import java.util.Scanner;

public class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      
      	String a = sc.next();
      
      	String b = a.toLowerCase();
      
      	if(a.equals(b))
          System.out.print("a");
      else 
          System.out.print("A");
    }
}