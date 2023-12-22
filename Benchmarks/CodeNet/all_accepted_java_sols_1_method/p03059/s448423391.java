
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int b=sc.nextInt();
		int time=sc.nextInt();
		int temp = (int) (time+0.5)/x;
		int number=temp*b;
      if(time<x) number=0;
		System.out.println(number);

	}
}
