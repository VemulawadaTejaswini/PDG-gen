import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int X = sc.nextInt();
		sc.close();
		int first = (2 * K - 1)/2;
		for(int i = 0;i <= first * 2;i++){
			if(i == 0){
				System.out.print(X - first);
			}else{
				System.out.print(" " + (X - first + i));
			}
		}
	}
}