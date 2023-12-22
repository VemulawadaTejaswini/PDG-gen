import java.util.Scanner;

  
public class Main {
	
	
  public static void main(String[] args) {
	  int n=Integer.MAX_VALUE;
	  Scanner sc=new Scanner(System.in);
	 
	  for(int i=0;i<n;i++){
	  int a=Integer.parseInt(sc.next());
	 String s=sc.next();
	 int b=Integer.parseInt(sc.next()); 
	 
	 if(s.equals("+")){
		 System.out.println(a+b);
	 }
	 else if(s.equals("-")){
		 System.out.println(a-b); 
	 
	 }
 else if(s.equals("*")){
	 System.out.println(a*b);
 }
	 
 else if(s.equals("/")){
	 System.out.println(a/b);
 
 }
 else if(s.equals("?")){
	break; 
 }
 }
  }
}