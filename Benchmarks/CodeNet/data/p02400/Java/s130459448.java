import java.util.Scanner;

class Main{
  public static void main(String[] arg){
  	double r, menseki, ensyu;
  	Scanner in = new Scanner(System.in);
  	r = in.nextDouble();
  	menseki = r*r*Math.PI;
  	ensyu = r*2*Math.PI;
  	System.out.printf("%.6f %.6f",menseki,ensyu);
	}
}