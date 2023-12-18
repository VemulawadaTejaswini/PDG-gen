import java.util.Scanner;

public class Main { 
  public static void main(String[] args){
//	  int x_1,y_1;
//	  int x_2,y_2;
	  Scanner sc = new Scanner(System.in);
/*	  double a=0;
	  double b=0;
	  double c=0;
	  double d=0;
	  */
	  double x_1 = sc.nextInt();
	  double y_1 = sc.nextInt();
	  double x_2 = sc.nextInt();
	  double y_2 = sc.nextInt();
	  
	  double a = (x_1 - x_2)*(x_1 - x_2);
	  double b = (y_1 - y_2)*(y_1 - y_2);
	  double c = a + b;
	  double d = Math.sqrt(c);
	  System.out.printf("%f\n",d);
	  
	  }
}

