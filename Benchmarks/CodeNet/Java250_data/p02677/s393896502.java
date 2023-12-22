import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int a=sc.nextInt();
		int b=sc.nextInt();
		int h=sc.nextInt();
		int m=sc.nextInt();

		double angle= Math.abs((double)h/12+((double)m/60)/12.0 -(double)m/60.0)*2*Math.PI;
		double res= (double)a*a +(double)b*b -(double) 2*a*b*Math.cos(angle);
		res =Math.sqrt(res);

        System.out.printf("%.20f",res);
	}

}
