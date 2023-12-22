import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = 0;
		int B = 0;
		A = sc.nextInt();
		B = sc.nextInt();

		if(A >= 10 || B >= 10){
			System.out.println(-1);
		}
		else if(A < 1 || B < 1){
			System.out.println(-1);
		}
		else {
			System.out.println(A * B);
		}
	}
}
