import java.util.Scanner;
class Main {
	public static void main(String[] srgs){
		Scanner scn = new Scanner(System.in);
		int x;
		int i = 0;
		while (true){
			x = scn.nextInt();
			if (x == 0) break;
			System.out.printf("Case %d: %d\n", i + 1, x);
			i++;
		}
		scn.close();
	}
}