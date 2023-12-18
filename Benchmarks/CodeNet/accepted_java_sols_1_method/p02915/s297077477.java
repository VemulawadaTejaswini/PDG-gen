import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = Integer.parseInt(scan.next());
		
		scan.close();
		
        System.out.println(N * N * N);
	}
}
