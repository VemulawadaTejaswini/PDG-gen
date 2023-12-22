import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner Str = new Scanner(System.in);
  	int a = Integer.parseInt(Str.next());
  	int b = Integer.parseInt(Str.next());
  	if(Math.floor(a / 10) + Math.floor(b / 10) == 0){
    	System.out.println(a*b); 
  	}else{
   	 System.out.println("-1"); 
 	}  
  }
}