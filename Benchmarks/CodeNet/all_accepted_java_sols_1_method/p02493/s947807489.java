import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x[] = new int[n];
		for(int i = 0; i < n; i++){
			x[i] = sc.nextInt();
		}
		for(int i = n-1; i >0; i--){
			System.out.print(x[i]+" ");
		}
		System.out.println(x[0]);
	}
}