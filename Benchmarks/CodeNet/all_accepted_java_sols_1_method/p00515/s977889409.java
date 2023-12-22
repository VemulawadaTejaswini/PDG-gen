import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int size = 5;
		
		int sum = 0;
		for(int i = 0; i < size; i++){
			sum += Math.max(40, sc.nextInt());
		}
		
		System.out.println(sum / size);
		
	}

}