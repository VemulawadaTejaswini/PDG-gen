import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		String readNum = stdin.nextLine();
		String[] twoNum = readNum.trim().split("\\s+");
		int a = Integer.parseInt(twoNum[0]);
		int b = Integer.parseInt(twoNum[1]);
		if ((a >= -1000 && a <= 1000) && (b >= -1000 && b <= 1000)) {
			if (a < b) {
				System.out.println("a < b");
			} else if (a > b) {
				System.out.println("a > b");
			} else if (a == b) {
				System.out.println("a == b");
			}
		}
	}
}