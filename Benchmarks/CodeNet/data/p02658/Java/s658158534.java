import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Long sum = 1L;
		int n = sc.nextInt();
		for(int i=0; i<n; i++) sum *= sc.nextLong();
		System.out.println(sum > 1000000000000000000L ? -1 : sum);
	}
}