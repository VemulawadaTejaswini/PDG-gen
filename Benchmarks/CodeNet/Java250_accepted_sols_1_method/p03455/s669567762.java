import java.util.*;
 
public class Main{
 
	public static void main(String[] args){
      
      Scanner scanner = new Scanner(System.in);
      
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      
      int result = a * b;
      
      if(result % 2 ==0 ){ System.out.println("Even");}
      else{System.out.println("Odd");}
  
 }
}