import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
	
	while (in.hasNext()) {
	  int a = in.nextInt();
	  int countOdd = a / 2 + a % 2;
	  
	  System.out.printf("%f\n", countOdd / (double)a);
	}
  }
}