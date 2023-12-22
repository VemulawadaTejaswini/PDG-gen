import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int a = sc.nextInt();
		int i=1;
		int tmp=h;
		while(true) {
			tmp = tmp-a;
			if(tmp <= 0) break;
			i++;
		}
		System.out.println(i);
		sc.close();

	}

}