import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] data = str.split(" ");
		int num[] = new int[data.length];
		for(int i = 0; i < data.length; i++){
			num[i] = Integer.parseInt(data[i]);
		}
	
		int a = num[0];
		double p = Math.PI;

		System.out.println((a * a * p) + " " + (a * 2 * p));
	}
}
