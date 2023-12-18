import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doIt();

	}
	
	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String s[] = str.split(",");
		int dis = Integer.parseInt(s[0]);
		int ang = Integer.parseInt(s[1]);
		double x = 0, y = 0;
		int angle = 90;

		while(dis != 0 || ang != 0){
			double rad = ((double)angle / 180) * Math.PI;
			x += dis * Math.cos(rad);
			y += dis * Math.sin(rad);
			angle -= ang;
			str = sc.next();
			s = str.split(",");
			dis = Integer.parseInt(s[0]);
			ang = Integer.parseInt(s[1]);
			
		}
		System.out.println((int)x);
		System.out.println((int)y);
		
	}

}