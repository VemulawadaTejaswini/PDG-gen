import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt() , b = sc.nextInt() , c = 1;
		int n = a + b;
		while(n >= 10){
			n =n/10;
			c++;
		}
		System.out.println(c);
	}
}