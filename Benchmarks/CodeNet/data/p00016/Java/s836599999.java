import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = 0;
		double y = 0;
		int theta = 0;
		for(;;){
			String s = sc.nextLine();
			if(s.equals("0,0")){
				break;
			}
			int a = Integer.parseInt(s.substring(0,s.indexOf(",")));
			int b = Integer.parseInt(s.substring(s.indexOf(",")+1,s.length()));
			if(a==0&&b==0){
				break;
			}
			y+=a*Math.cos(Math.toRadians(theta));
			x+=a*Math.sin(Math.toRadians(theta));
			theta += b;
		}
		int xx = (int) x;
		int yy = (int) y;
		System.out.println(xx);
		System.out.println(yy);
	}

}