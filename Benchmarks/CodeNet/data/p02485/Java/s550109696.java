import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(true){
			int count = 0;
			int n = in.nextInt();
			if(n == 0) break;
			while(true){
				count = count + n % 10;
				n = n / 10;
				if(n == 0) break;
			}
			System.out.println(count);
		}
	}
}