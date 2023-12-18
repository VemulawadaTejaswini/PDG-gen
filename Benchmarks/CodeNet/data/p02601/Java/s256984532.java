import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		sc.close();
		
		int grCount = 0;
		int blCount = 0;
		while(A >= B) {
			B *= 2;
			grCount++;
		}
		while(B >= C) {
			C *= 2;
			blCount++;
		}
		if(grCount + blCount <= K) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}