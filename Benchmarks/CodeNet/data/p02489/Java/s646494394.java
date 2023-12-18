import java.util.Scanner;


public class Main {


	public static void main(String[] args) {

		int x = 1;
		int i = 1;
		Scanner sc = new Scanner(System.in);


		while(x != 0){

			x = sc.nextInt();

			if(x == 0){
				break;
			}

			System.out.println("Case " + i + ": " + x);
			i++;


		}


	}

}