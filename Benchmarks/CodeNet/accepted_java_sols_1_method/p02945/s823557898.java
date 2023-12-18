import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		int max = A + B;
		if(A - B > max){
			max = A - B;
			if(A * B > max){
				max = A * B;
			}
		}else if(A * B > max){
			max = A * B;
		}
		System.out.println(max);
	}
}