import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = 0;
		double y = 0;
		double angle = 90;
		
		while(sc.hasNext()){
			String[] str = sc.nextLine().split(",");
			int step_count = Integer.parseInt(str[0]);
			int rotation = Integer.parseInt(str[1]);
			
			if(step_count == 0 && rotation == 0)
				break;
			
			x = x + step_count * Math.cos(Math.toRadians(angle));
			y = y + step_count * Math.sin(Math.toRadians(angle));
			angle = angle - rotation;
		}
		System.out.println((int)x);
		System.out.println((int)y);
	}
}