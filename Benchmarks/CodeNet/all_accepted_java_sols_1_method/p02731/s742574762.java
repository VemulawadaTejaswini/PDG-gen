import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int L =  sc.nextInt();
	double x = (double)L/3;
	double V = x*x*x;
    System.out.println(V) ;
  }
}