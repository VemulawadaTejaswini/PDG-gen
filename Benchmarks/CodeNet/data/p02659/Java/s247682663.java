import java.util.Scanner;
class Main{
	public static void main(String[] args){
    Scanner sr = new Scanner(System.in);
      int A = sr.nextInt();
      double B = sr.nextDouble();
      double C = (double)A*B;
      System.out.println(Math.floor(C));
    }
}