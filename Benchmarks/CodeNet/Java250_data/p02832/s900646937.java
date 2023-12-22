
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ary = new int[n];
		int check = 1;
		for(int i = 0; i < n; i++){
			if(check == sc.nextInt()){
				check++;
			}
		}
		System.out.println(check == 1 ? -1 : n - check + 1);
	}
}
