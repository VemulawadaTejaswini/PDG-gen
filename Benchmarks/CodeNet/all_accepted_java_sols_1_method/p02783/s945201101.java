import java.util.*;
public class Main{
  
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int an = a/b;
      if(a%b != 0) an+=1;
      
      System.out.println(an);
	}
 
}
