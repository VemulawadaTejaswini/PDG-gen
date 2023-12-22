import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		sc.close();

		int hc = 0;
		do {
			hc++;
			if(w*hc>=n){
				break;
			}
		} while (hc<=h);

		int wc = 0;
		do {
			wc++;
			if(h*wc>=n){
				break;
			}
		} while (wc<=h);

		System.out.println(hc<wc?hc:wc);
	}
}