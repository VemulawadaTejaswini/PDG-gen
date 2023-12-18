import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(n+":");
		for(int i = 2; n != 1; i++){
			while(n%i == 0){
				n /= i;
				System.out.print(" "+i);
			}
		}
		System.out.println();
	}
}