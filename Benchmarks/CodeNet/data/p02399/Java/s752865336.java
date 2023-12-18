import java.util.Scanner;

  
public class Main {
	
	
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  
	  
	  
		  long a=Integer.parseInt(sc.next());
		  long  b=Integer.parseInt(sc.next());
		  long d=a/b;
		  long r=a%b;
		  double f=(double)a/(double)b;
		  System.out.print(d +" "+ r +" ");
		  System.out.printf("%.5f\n",f);
  }
}