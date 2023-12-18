import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();	
			int y=1;
			for(int i=1;i<x;i++){
			y=i*y;
			}
			System.out.print(y*x);
	}
}