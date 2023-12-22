import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int diff = b -a;
		int alen = 0;
		for(int i = 1;i < diff;++i)
			alen += i;
		System.out.println(alen - a);
	}
}
