import java.util.Scanner;

  
public class Main {
	
	
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  
	  
	  
		  int a=Integer.parseInt(sc.next());
		  int b=Integer.parseInt(sc.next());
		  int c=Integer.parseInt(sc.next());
		  int x,y,z;
		  
		  x=Math.max(a,b);
		  z=Math.min(a, b);
		  y=Math.max(x, c);
		  int q=Math.min(x, c);
		  int p=Math.max(z, q);
		  int r=Math.min(z, q);

		  System.out.println(r +" "+ p +" "+  y);;
		  
  }
}