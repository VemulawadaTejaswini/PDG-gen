import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int K = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();
		int num = 0;

		for (int i = A; i <= B; i++){
			if (i % K == 0){
				num += 1;
			}
		}
		if (num > 0){
			System.out.println("OK");
		}else if (num == 0){
			System.out.println("NG");
		}
	}
}