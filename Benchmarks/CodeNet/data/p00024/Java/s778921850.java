import java.io.IOException;
import java.util.Scanner;


public class Main{
	public static void main(String args[]) throws IOException{
		Scanner bf = new Scanner(System.in);
		while(bf.hasNext()){
			double v = Double.parseDouble(bf.nextLine());
			double y = v*v/19.6;
			int n = (int)Math.ceil((y+5)/5);
			System.out.println(n);
		}
	}
}