import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		int N = io.nextInt();
		int a_min = Integer.MAX_VALUE;
		int a_max = Integer.MIN_VALUE;
		
		for(int i=0;i<N;i++){
			int a = io.nextInt();
			a_min = Math.min(a_min,a);
			a_max = Math.max(a_max,a);
		}
		
		System.out.println(a_max-a_min);
		
	}	
}