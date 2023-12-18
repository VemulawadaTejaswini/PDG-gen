import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		while (N>0) {
			if (N%10==7) {
				System.out.println("Yes");
				return ;
			}
			N=N/10;
		}
		System.out.println("No");
  	}
}
