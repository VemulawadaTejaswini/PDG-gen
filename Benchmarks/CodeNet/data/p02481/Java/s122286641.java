import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int men;
        int syu;
        men = x * y;
        syu = x * 2 + y * 2;
		System.out.println(men);
		System.out.println(syu);
	}
}