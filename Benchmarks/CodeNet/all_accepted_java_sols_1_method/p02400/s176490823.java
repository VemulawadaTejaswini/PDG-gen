import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] data = str.split(" ");
		double num[] = new double[data.length];
		for(int i = 0; i < data.length; i++){
			num[i] = Double.parseDouble(data[i]);
		}
	
		double a = num[0];
		double p = Math.PI;

		double kotae = (a * a * p) ;
		double kotae2 = (a * 2 * p);
		String hoge = String.format("%.6f",kotae);
		String hoge2 = String.format("%.6f",kotae2);
		System.out.println(hoge + " " + hoge2);
	}
}
