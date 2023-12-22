import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] mtns = new int[10];
		int first, second, third;
		
		for(int i=0; i<10; i++) {
			mtns[i] = sc.nextInt();
		}
		
		Arrays.sort(mtns);
		
		System.out.println(mtns[9]);
		System.out.println(mtns[8]);
		System.out.println(mtns[7]);
		
	}

}