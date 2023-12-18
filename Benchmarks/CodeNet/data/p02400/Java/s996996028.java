import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    
	  Scanner sc = new Scanner(System.in);
	  
	  double r = sc.nextDouble();
	  double ritu = Math.PI;
	  double men = 0;
	  double shuu = 0;
	  
	  //String  = String.format("%.5f", );
	  men = r*r*ritu;
	  shuu = 2 * ritu * r;
	  
	  String strmen = String.format("%.6f",men );
	  String strshuu = String.format("%.6f",shuu );
	  
	  System.out.println(strmen+" "+strshuu);
  }
}