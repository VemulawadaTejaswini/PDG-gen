import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		int x=scan.nextInt();
		int y=scan.nextInt();
		
		System.out.print(x*y+" ");
		System.out.println(2*(x+y));
		
	}

}