import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int a,b;
		int length;
		while(sc.hasNext()){
			a = sc.nextInt();
			b = sc.nextInt();
			length = String.valueOf((a+b)).length();
			System.out.println(length);;
		}
		
	}

}