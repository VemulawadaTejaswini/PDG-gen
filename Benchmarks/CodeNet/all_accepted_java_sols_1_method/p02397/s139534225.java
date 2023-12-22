import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);


		while(true){
			int x = scan.nextInt();
			int y = scan.nextInt();

			if(x==0 & y==0){break;}

			String result = x < y ? x + " " + y : y + " " + x;

			System.out.println(result);

		}

		scan.close();
	}
}