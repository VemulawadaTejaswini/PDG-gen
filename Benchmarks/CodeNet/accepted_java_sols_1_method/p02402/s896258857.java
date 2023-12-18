import java.util.ArrayList;
import java.util.Scanner;
public class Main{

	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		int n = sc.nextInt();
		ArrayList<Integer>array = new ArrayList<>();
		long totalInt = 0L;
		int maxInt = Integer.MIN_VALUE;
		int minInt = Integer.MAX_VALUE;

		for(int i = 0; i < n;i++) {
			array.add(sc.nextInt());
		}
		for(int arrayInt:array) {
			totalInt += arrayInt;
			minInt = Math.min(minInt, arrayInt);
			maxInt = Math.max(maxInt, arrayInt);
		}
		System.out.println(minInt + " " + maxInt + " " + totalInt);


	}
}
