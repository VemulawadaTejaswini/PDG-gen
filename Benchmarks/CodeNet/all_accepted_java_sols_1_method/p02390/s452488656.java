import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int s = x%60;
		int h = x/3600;
		int m = x/60-60*h;
		System.out.println(h+":"+m+":"+s);
	}
}