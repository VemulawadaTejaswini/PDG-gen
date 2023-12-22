import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int min = a + b;
		if(b + c < min){
			min = b + c;
		}
		if(c + a < min){
			min = c + a;
		}
		System.out.println(min);
	}
}
