import java.util.Scanner;
import java.lang.Math;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println(Math.ceil(Math.log10(a+b)));
		}
	}

}