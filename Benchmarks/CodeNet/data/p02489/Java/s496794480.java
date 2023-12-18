import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int value;
		int index = 1;

		while ((value = sc.nextInt()) != 0){
			System.out.println("Case " + index + ": " + value);
			index++;
		}
	}
}