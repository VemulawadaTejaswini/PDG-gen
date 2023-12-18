import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int answer = 0;
		for(int red = 0;red <=n;red += r) {
			for(int green = 0;green <=n -red;green+=g) {
				if((n-red-green) % b ==0) {
					answer++;
				}
			}
		}
		System.out.println(answer);
	}
}