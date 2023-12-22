import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();

		int h = time / 3600;
		int m = (time - (h * 3600)) / 60;
		int s = time - (h * 3600) - (m * 60);

		System.out.println(h + ":" + m + ":" + s);	
	}
}

