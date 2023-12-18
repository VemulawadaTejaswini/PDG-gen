import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int angle = 0;
		sc.useDelimiter("[\n ,]");
		double px = 0.0;
		double py = 0.0;
		
		while(true){
			int len = sc.nextInt();
			int theta = sc.nextInt();
			if (len == 0 && theta == 0){
				break;
			}
			px += len*Math.sin(angle*Math.PI/180);
			py += len*Math.cos(angle*Math.PI/180);
			angle += theta;
		}
		
		System.out.printf("%d\n%d\n", (int)px, (int)py);
		sc.close();
	}
}