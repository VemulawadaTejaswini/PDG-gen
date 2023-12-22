import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		int x=scan.nextInt();
		int y=scan.nextInt();
		int z=scan.nextInt();
		int c=0;
		for (int i = x; i <= y; i++) {
			if(z%i==0)
				c++;
		}
		System.out.println(c);
		
	}

}