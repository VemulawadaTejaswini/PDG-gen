import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String picture = "";
		for (int i = 0; i < h; i++) {
			String text = sc.next();
			picture += (text + "\r\n" + text + "\r\n");
		}
		System.out.println(picture);
		
	}
}
