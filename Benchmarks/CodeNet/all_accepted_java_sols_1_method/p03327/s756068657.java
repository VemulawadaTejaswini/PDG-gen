import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		int s = sc.nextInt();
		if(s < 1000)
			System.out.println("ABC");
		else
			System.out.println("ABD");
	}
}
