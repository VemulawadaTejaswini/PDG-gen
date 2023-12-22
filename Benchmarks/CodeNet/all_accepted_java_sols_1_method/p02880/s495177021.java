
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isKuku = false;
		for(int i = 1; i < 10; i++){
			for(int k = 1; k < 10; k++){
				if(n == i * k){
					isKuku = true;
				}
			}
		}
		System.out.println(isKuku ? "Yes" : "No");
	}
}
