import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		
		
		int h = S/3600;
		int a = S%3600;
		int m = a/60;
		int s = a%60;
			System.out.println(h+(":")+m+(":")+s);
			
			sc.close();
		}
	}

