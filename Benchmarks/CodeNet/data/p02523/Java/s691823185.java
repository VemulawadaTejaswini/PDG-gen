import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int x1=scan.nextInt();
		int y1=scan.nextInt();
		int x2=scan.nextInt();
		int y2=scan.nextInt();
		System.out.printf("%.8f",Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1))));
	}

}