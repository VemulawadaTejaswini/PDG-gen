import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		String readNum = stdin.nextLine();
		String[] twoNum = readNum.trim().split("\\s+");
		int a = Integer.parseInt(twoNum[0]);
		int b = Integer.parseInt(twoNum[1]);
		int c = Integer.parseInt(twoNum[2]);
		if ((a >= 0 && a <= 100) && (b >= 0 && b <= 100) && (c >= 0 && c <= 100)) {
			if (a < b && b < c) {
				System.out.println("Yes");
			} else  {
				System.out.println("No");
			}
		}
	}
}