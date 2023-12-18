import java.util.Scanner;

  
public class Main {
	
	
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  
	  
	  
		  long a=Integer.parseInt(sc.next());
		  long  b=Integer.parseInt(sc.next());
		  long d=a/b;
		  long r=a%b;
		  float f=(float)a/(float)b;
		  System.out.println(d +" "+ r +" "+ f);
  }
}