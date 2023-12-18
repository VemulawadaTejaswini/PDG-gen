import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
	Scanner scan = new Scanner(System.in);
	int x = scan.nextInt();
	int y = scan.nextInt();
	int z = scan.nextInt();
	if(x<y&&y<z&&x<z) System.out.println("Yes");
	else System.out.println("No");
	}
}