import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		while(true){
			int x = stdin.nextInt();
			int h = stdin.nextInt();
			if(x != 0 || h != 0) {
				double x2 = x / 2;
				double xh = Math.pow((double)x2, 2) + Math.pow((double)h, 2);
				double xh2 = Math.sqrt(xh);
				double s = (x * x) + (xh2 * x * 0.5) * 4;
				System.out.println(s);
			} else{
				break;
			}
		}

	}
}