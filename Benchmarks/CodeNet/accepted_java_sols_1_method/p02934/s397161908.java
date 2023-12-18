import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		float sum = 0;
		for(int i=1; i<=N; i++) {
			sum+=1/(sc.nextFloat());
		}
		System.out.println(1/sum);
	}
}	
