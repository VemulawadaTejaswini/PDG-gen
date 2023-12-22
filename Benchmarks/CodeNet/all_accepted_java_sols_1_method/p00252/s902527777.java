import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();
		int b3 = sc.nextInt();
		
		if(b1 == 1)
			if(b2 == 1)
				System.out.println("Open");
			else
				System.out.println("Close");
		
		else
			if(b2 == 1)
				System.out.println("Close");
			else{
				if(b3 == 1)
					System.out.println("Open");
				else
					System.out.println("Close");
			}
		sc.close();
	}
}