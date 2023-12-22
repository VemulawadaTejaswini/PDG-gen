import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0; i<3; i++) {
			int a = sc.nextInt();
			max = Math.max(max,a);
			min = Math.min(min, a);
		}
		
		System.out.println(max-min);
		

	}

}