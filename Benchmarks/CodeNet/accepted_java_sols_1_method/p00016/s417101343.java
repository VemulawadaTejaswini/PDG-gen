import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double x=0.0,y=0.0,angle = 90;
		while(true){
			String[] s = sc.nextLine().split(",");
			int value = Integer.parseInt(s[0]);
			int value_2 = Integer.parseInt(s[1]);

			if(value == 0 && value_2 == 0) break;

			x += Math.cos(angle*Math.PI/180)*value;
			y += Math.sin(angle*Math.PI/180)*value;
			angle -= value_2;
		}
		System.out.println((int)x);
		System.out.println((int)y);
	}
}