import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		for(;;){
			int m = scan.nextInt();
			int f = scan.nextInt();
			int r = scan.nextInt();
			int sum;
			if(m == -1)
				sum = m;
			else if(f == -1)
				sum = f;
			else if(m == -1 && f == -1)
				sum = 0;
			else
				sum = m + f;

			if(m == -1 && f == -1 && r == -1)
				break;
			else if(sum >= 80)
				System.out.println("A");
			else if(sum >= 65 && sum < 80)
				System.out.println("B");
			else if((sum >= 50 && sum < 65) || (sum >= 30 && sum < 50 && r >= 50))
				System.out.println("C");
			else if(sum >= 30 && sum < 50)
				System.out.println("D");
			else if(sum < 30)
				System.out.println("F");

			if(r == -1)
				continue;

		}
	}

}