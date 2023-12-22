import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner x  = new Scanner(System.in);
		int n = x.nextInt();
		int[] price = new int[n];
		for(int m = 0 ; m < n ; m++){
			price[m] = x.nextInt();
		}
		System.out.print(price[n-1]);
		for(int g = n-2 ; g >= 0 ; g--){
			System.out.print(" " + price[g]);
		}
		System.out.println();
	}
}