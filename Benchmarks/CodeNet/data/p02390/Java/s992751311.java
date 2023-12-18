import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
	Scanner scan = new Scanner(System.in);
	int x = scan.nextInt();
	int y = x/60;
	x %= 60;
	int z  = y/60;
	y %= 60;
	System.out.println(z+":"+y+":"+x);
	}
}