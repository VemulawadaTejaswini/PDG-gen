import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int number = in.nextInt(); 
		int h = number / 3600;
		int min = number % 3600 / 60;
		int  s = (number % 3600) % 60;
		System.out.println(h+":"+min+":"+s);
	}
}