import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int A=scan.nextInt();
		int B=scan.nextInt();
		int H=scan.nextInt();
		int M=scan.nextInt();
		double wm=360/60;
		double wh1=360/12;
		double wh2=30.0/60.0;
		double m_angle=(double)M*wm;
		double h_angle=(double)H*wh1+(double)M*wh2;
		double angle_a=m_angle>h_angle ? m_angle-h_angle : h_angle-m_angle;
		if(angle_a>180)angle_a=360-angle_a;
		double b=Math.pow(A,2);
		double c=Math.pow(B, 2);
		
		double a=Math.sqrt(b+c-2*A*B*Math.cos(Math.toRadians(angle_a)));
		System.out.println(a);

	}

}