import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		float ans = 0;
		
		float aka = (float)h * 30 + (float)m * 1/2;
		float bka = (float)m * 60;
		
		float saka;
		if(aka < bka) {
			saka = bka - aka;
		}else {
			saka = aka -bka;
		}
		if(saka > 180) {
			saka = 360 - saka;
		}
		double rad = saka * Math.PI / 2;
		
		System.out.println(String.format("%.20f",Math.pow(a*a + b*b - 2 * a * b * Math.cos(Math.toRadians((double)saka)),1.0/2.0)));
		
	}
	
}
