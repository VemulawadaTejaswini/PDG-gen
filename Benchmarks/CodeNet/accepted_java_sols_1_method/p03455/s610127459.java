import java.util.Scanner;


class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int a,b;
		
		int p;
		
		while(scan.hasNextInt())
		{
			a = scan.nextInt();
			b = scan.nextInt();
			
			p = a * b;
			
			if(p % 2 == 1)
				System.out.println("Odd");
			else
				System.out.println("Even");
		}

	}

}
