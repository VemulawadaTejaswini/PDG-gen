import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		if(6<=A && A<=12) {
			B /= 2;
		}else if(A<=5) {
			B = 0;
		}
		System.out.println(B);
		sc.close();
	}
}
