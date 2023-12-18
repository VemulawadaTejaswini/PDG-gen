import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int allSecond = sc.nextInt();
		
		int h = allSecond / 3600;
		int m = allSecond % 3600 / 60;
		int s = allSecond % 60;
		
		System.out.println(h + ":" + m + ":" + s);
		
	}

}
