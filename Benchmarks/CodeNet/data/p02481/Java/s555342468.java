import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		while(scan.hasNext()){
			int x=scan.nextInt();
			int y=scan.nextInt();
			System.out.println(x*y+" "+(x+y)*2);
		}
	}

}