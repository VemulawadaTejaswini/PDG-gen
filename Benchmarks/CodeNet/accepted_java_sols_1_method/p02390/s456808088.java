import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int S = sc.nextInt();
		
		int h = (int)Math.floor(S / 3600);
		int m = (int)Math.floor((S - h * 3600) / 60);
		int s = S - (h * 3600 + m * 60);
		
		System.out.println(h + ":" + m + ":" + s);
		
		sc.close();
	}

}

