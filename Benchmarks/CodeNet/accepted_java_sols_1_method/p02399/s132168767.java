import java.util.*;
import java.io.*;

class Main{		//?????£??????

	int a;
	int b;

	public Main(){
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();

		int x = a / b;
		int y = a % b;
		double z = (double)a / (double)b;

		System.out.printf("%d %d %.5f", x, y, z);
		System.out.println("");
	}
	public static void main(String[] args){
		new Main();
	}
}