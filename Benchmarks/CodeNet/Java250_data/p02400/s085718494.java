import java.util.Scanner;

  
public class Main {
	
	
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	Double r=Double.parseDouble(sc.next());
	double p=Math.PI;
	double s=r*r*p;
	double l=2*r*p;
	System.out.printf("%.6f",s);
	System.out.print(" ");
	System.out.printf("%.6f\n",l);
	
  }
}