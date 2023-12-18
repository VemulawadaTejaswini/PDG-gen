import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.nextLine();
		int k = sc.nextInt();


		//赤より緑の方を大きくする
		while(a >= b){
			b *= 2;
			k--;
		}

		//緑より青を大きくする
		while(b >= c){
			c *=2;
			k--;
		}

		if(k>=0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}

}