import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int int1 = sc.nextInt();
		int int2 = sc.nextInt();
		double hour = sc.nextInt();
		double minit = sc.nextInt();
		sc.close();

		double rad1 = (hour % 12 * 60 + minit * 1) / (6 * 60) * Math.PI;
		double rad2 = ((minit * 12) / (6 * 60)) * Math.PI;



		// 余弦定理
		double tmp = Math.pow(int1*Math.sin(rad1)-int2*Math.sin(rad2),2) + Math.pow(int1*Math.cos(rad1)-int2*Math.cos(rad2),2);
		System.out.println(Math.sqrt(tmp));

	}

}
