import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int num = -1;
		int min = Math.min(a*100/8, b*10);
		int max = Math.max(a*100/7, b*100/9);
		for (int i = min; i < max; i++) {
			int ta = (int)(i*0.08);
			int tb = (int)(i*0.1);
			if(ta == a && tb == b) {
				num = i;
				break;
			}
		}
		System.out.println(num);
	}
}
