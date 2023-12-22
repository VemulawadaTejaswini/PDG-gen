import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int h = scan.nextInt();
		int m = scan.nextInt();

		double lon = h * 30 + m * 0.5;
		double sho = m * 6 ;
		
		if(lon == 0) {
			lon = 360;
		}
		
		if(sho == 0) {
			sho = 360;
		}
		
		double big = 0;
		double small = 0;
		
		double answer = 0;
		
		if(lon > sho) {
			big = lon;
			small = sho;
		}else if(lon < sho) {
			big = sho;
			small = lon;
		}else if(lon == sho) {
			answer  = 0;
		}
		
		if((big - small) == 180) {
			answer = a + b;
		}
		
		
		double deg = big - small;
		if(deg > 180) {
			deg = 360 - deg;
		}
		
		if(deg > 180) {
			deg = 180 - (deg - 180);
		}
		
		double rad = Math.toRadians(deg);
		double cos = Math.cos(rad);
		answer = Math.sqrt(a*a + b*b - 2 * a * b * cos);
		
		if( deg == 90) {
			answer = Math.sqrt(a*a + b*b);
		}
		
		System.out.println(answer);
		
		
}
}
