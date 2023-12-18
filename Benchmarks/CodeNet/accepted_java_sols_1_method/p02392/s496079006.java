import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int x=scan.nextInt();
		int y=scan.nextInt();
		int z=scan.nextInt();
		if(x<y && y<z)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}