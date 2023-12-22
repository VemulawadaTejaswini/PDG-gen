import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int count=1;
		int x;
		while(true){
			x = scan.nextInt();
			if(x == 0){break;}

			System.out.println("Case " + count + ": " + x);
			count++;
		}
		scan.close();

	}
}