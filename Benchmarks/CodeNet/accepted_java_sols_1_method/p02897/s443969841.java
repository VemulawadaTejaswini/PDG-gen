import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double count = 0;
		for(int i=1;i<=N;i++) {
			if(i%2 == 1)count++;
		}
		
		double a = (Double)count/N;
		System.out.println(a);
		
		sc.close();	
	}
}