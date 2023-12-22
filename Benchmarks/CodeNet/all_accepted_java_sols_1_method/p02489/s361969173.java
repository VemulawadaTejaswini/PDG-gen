import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int count = 1;
		while(a != 0){
			System.out.println("Case "+count+":"+ " " + a);
			a = input.nextInt();
			count++;
		}
	}
}