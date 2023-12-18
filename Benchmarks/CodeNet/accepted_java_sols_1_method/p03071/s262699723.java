import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int point;
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		if(max == min) {
			point = max * 2;
		}else {
			point = max * 2 - 1;
		}
		System.out.println(point);
	}

}
