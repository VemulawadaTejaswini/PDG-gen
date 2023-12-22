import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		String b = a.nextLine();
		byte c = Byte.parseByte(b);
		boolean e = false;
		for(byte d = 1;d < 10;d++) {
			if(c % d == 0 && (c / d) < 10) e = true;
		}
		if(e) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		a.close();
	}
}
