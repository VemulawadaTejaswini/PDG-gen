import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int before = 0;
		long dai = 0;
		for (int i = 0; i < p; i++) {
			int height = sc.nextInt();
			if(before > height) {
				dai+=before - height;
			}else {
				before = height;
			}
		}
		System.out.println(dai);
	}
}