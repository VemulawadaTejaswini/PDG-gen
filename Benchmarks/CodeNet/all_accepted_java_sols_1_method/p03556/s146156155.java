import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		StringBuilder stdout = new StringBuilder();
		int sr = (int) Math.sqrt(sc.nextInt());
		stdout.append(sr * sr);
		System.out.println(stdout);
	}
}
