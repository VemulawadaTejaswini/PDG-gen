import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

			int[] A=new int[100];

			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();

			for(int i = 1;i <= n;i++){
				A[i] = scan.nextInt();
			}
			for(int i = n;i > 0;i--){
				if(i != n){
					System.out.print(" ");
				}
				System.out.print(A[i]);
			}
		}
	}