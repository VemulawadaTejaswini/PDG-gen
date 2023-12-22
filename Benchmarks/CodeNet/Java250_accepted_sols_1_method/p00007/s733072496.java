import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = 100000;
		int n = stdIn.nextInt();
		for (int i = 0; i < n; i++) {
			a *= 1.05;
			if(a%1000!=0){a+=1000-a%1000;}
		}
		System.out.println(a);
	}
}