import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		int y=scan.nextInt();
		int x=scan.nextInt();
		System.out.print(y/x);
		System.out.print(" "+y%x+" ");
		System.out.printf("%f",(double)y/x);
		System.out.println();
		
		
	}

}