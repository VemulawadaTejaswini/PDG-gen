import java.util.Scanner;



public class Main {


	public static void main(String[] args) {

		int x = 1;
		int y = 1;
		int w;

		Scanner sc = new Scanner(System.in);

		while(x != 0){

			x = sc.nextInt();
			y = sc.nextInt();

			if(x == 0 && y == 0)
			{
				break;
			}

		if(x < y){
			System.out.println(x + " " + y);
		}else{
			System.out.println(y + " " + x);

			x = sc.nextInt();
			y = sc.nextInt();
		}
		}


	}

}