import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double max = Math.pow((double)N/3, 3); 
		
		System.out.println(max);
		
	}

}