import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("[^-0-9.]+");
		
		double x=0, y=0;
		int a=0;
		while(true){
			int di = scan.nextInt();
			int ai = scan.nextInt();
			
			if(ai == 0 && di == 0){
				break;
			}
			
			x += Math.sin(Math.toRadians(a)) * di;
			y += Math.cos(Math.toRadians(a)) * di;
			
			a += ai;
		}
		System.out.println(String.format("%d\n%d", (int)x, (int)y));
	}

}