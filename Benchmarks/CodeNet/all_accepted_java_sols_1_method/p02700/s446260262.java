import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		while(true){
			C -= B;
			if(C <= 0){
				break;
			}
			A -= D;
			if(A <= 0){
				break;
			}
		}
		System.out.println(A > 0 ? "Yes" : "No");
	}
}