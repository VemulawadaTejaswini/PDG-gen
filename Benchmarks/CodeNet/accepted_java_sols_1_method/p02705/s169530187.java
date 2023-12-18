import java.util.Scanner;

class Main {
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    
    int r = stdIn.nextInt();
	double a = Math.PI;
    System.out.println(r * 2 * a);
  }
}
