import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		StringBuilder stdout = new StringBuilder();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		stdout.append((x-z)/(y+z));
		System.out.println(stdout);
	}
}
