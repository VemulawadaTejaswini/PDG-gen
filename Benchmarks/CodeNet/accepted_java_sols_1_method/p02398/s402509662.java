import java.util.Scanner;
public class Main {
    public static void main(String[] defargs) {
        Scanner scanner = new Scanner(System.in);
	    int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int yakusu = 0;
		for (int i = a;i <= b; i++) {
			if (c % i == 0)
				yakusu++;
		}
		System.out.println(yakusu);
	}
}

