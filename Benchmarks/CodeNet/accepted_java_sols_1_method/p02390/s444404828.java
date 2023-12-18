import java.util.*;

public class Main {
	public static void main(String[] args){
		
		Scanner inputTime = new Scanner(System.in);
		int input = inputTime.nextInt();
		int h = input / 3600;
		int amari = input % 3600;
		int m = amari / 60;
		int s = amari % 60;
		
		System.out.println(h + ":" + m + ":" + s);
		
	}
}