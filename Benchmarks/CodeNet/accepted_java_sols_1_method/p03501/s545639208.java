import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		a = a*time;
		if(a < b)System.out.print(a);
		else System.out.print(b);
	}
}