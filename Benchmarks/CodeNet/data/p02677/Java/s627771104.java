import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int int1 = sc.nextInt();
		int int2 = sc.nextInt();
		double hour = sc.nextInt();
		double minit = sc.nextInt();
		sc.close();

		double rad1 = ((hour % 12 / 6) + (minit / (6 * 60)));
		double rad2 = (minit / 30);

		double rad = Math.abs(rad1 - rad2);

		if(rad == 1) {
			System.out.println(int1 - int2);
		}else if(rad > 1) {
			rad = 2 - rad;
		}

		// 余弦定理
		double tmp = Math.pow(int1,2)+Math.pow(int2,2) - (2 * int1 * int2 * Math.cos(rad * Math.PI));
		System.out.println(String.format("%.11f", Math.sqrt(tmp)));

	}

}
