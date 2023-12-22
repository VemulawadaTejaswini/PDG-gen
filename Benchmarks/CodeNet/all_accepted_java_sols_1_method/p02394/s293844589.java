

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		sc.close();

		if (y >= r && y <= h-r && x >=r && x <= w-r){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}






	}

}

