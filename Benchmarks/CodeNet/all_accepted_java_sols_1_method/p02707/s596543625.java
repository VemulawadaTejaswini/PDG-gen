import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int N = scan.nextInt();
	int shine[] = new int[N];
	for(int i = 1;i != N; i++) {
		int A = scan.nextInt();
		shine[A-1]++;
	}
	
	for(int j = 0;j != N; j++) {
		System.out.println(shine[j]);
	}
	
	}

}
