import java.util.Scanner;
public class Main {
	public static void main(String[] args){
	      Scanner sc = new Scanner(System.in);
	      int x = sc.nextInt();
	      int a = sc.nextInt();
	      int b = sc.nextInt();
	      int oturi = (x-a) % b;
	      System.out.println(oturi);
	}
}