import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int max = Math.max(A,Math.max(B,C));
//		if(A==max) {
//			System.out.println(B+C+A*Math.pow(2,(sc.nextInt()-1)));
//		}
//		if(B==max) {
//			System.out.println(A+C+B*Math.pow(2,(sc.nextInt()-1)));
//		}
//		if(C==max) {
//			System.out.println(B+A+C*Math.pow(2,(sc.nextInt()-1)));
//		}
		System.out.println((int)(A+B+C+max*(Math.pow(2,sc.nextInt())-1)));
		sc.close();
	}
}
