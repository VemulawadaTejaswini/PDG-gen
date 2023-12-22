import java.util.Scanner;

public class Main{
	static public void  main(String[] args){
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int sum = a + b;
		if (sum % 2 == 1){
			sum++;
		}
		System.out.println(sum / 2);
	}
}
