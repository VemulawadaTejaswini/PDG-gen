import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		sb.append(scan.nextLine());
		sb.reverse();
		System.out.println(sb);
	}
}