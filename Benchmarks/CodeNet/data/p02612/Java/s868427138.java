import java.util.Scanner;

public class A {
	public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int N = scan.nextInt();
      System.out.println(1000-N%1000);
    }
}