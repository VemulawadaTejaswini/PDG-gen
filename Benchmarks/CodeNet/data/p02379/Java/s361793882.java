import java.util.Scanner;

public class Main { 
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);

	  double x_1 = sc.nextDouble();
	  double y_1 = sc.nextDouble();
	  double x_2 = sc.nextDouble();
	  double y_2 = sc.nextDouble();
	  
	  double a = Math.pow((x_1 - x_2),2);
	  double b = Math.pow((y_1 - y_2),2);
	  double c = Math.sqrt(a+b);
	 
	  System.out.println(c);
	  
	  }
}

