import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();

		int money=0;

		while(true){
			money+=1000;
			if(money>=A){
				break;
			}
		}

		System.out.println(money-A);


	}

}
