import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] mtns = new int[10];
		int first, second, third;
		
		for(int i=0; i<10; i++) {
			mtns[i] = sc.nextInt();
		}
		
		first = mtns[0];
		second = mtns[1];
		third = mtns[2];
		
		for(int i=1; i<10; i++) {
			if(mtns[i] > first) {
				first = mtns[i];
				continue;
			}
			if(mtns[i] > second) {
				second = mtns[i];
				continue;
			}
			if(mtns[i] > third) {
				third = mtns[i];
			}
		}
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		
		
	}
}