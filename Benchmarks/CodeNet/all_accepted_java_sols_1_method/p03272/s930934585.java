import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N,i;		
	
		int diff;
		
		N = sc.nextInt();
		i = sc.nextInt();
				
		diff = N - i + 1;
		
		System.out.println(diff);
		
	}

}