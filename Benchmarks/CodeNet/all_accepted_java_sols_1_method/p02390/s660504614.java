
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(input/3600+":"+(input%3600)/60+":"+(input%3600)%60);
	}
}