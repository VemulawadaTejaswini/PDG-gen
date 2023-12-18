import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		int x=scan.nextInt();
		int y=scan.nextInt();
		
		
		if(x>=1 && x<=100 && y>=1 && y<=100 && y%2==0) {
			y=y/2;
			
		}
		
		
		System.out.println(x+y);
	}
}

