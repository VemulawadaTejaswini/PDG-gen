
import java.util.Scanner;
public class Main{ 
	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
    int a = input.nextInt();
    int b = input.nextInt();
    int h = input.nextInt();
    int s = (int) (0.5*h*(a+b));
    System.out.println(s);
   
	}
}