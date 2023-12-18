import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x = Integer.parseInt(scan.next());
		int y = (int)Math.pow(x, 3);
		System.out.println(y + "\n");
		scan.close();
	}
}