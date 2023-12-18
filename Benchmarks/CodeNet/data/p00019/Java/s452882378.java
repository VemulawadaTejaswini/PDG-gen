import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println(kaijo(scan.nextInt()));
	}

	private static int kaijo(int n){
		if(n == 0){
			return 1;
		}else{
			return n * kaijo(n - 1);
		}
	}
}