
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int R = in.nextInt();
		if(R < 1200) {
			System.out.print("ABC");
		}else if(R < 2800) {
			System.out.print("ARC");
		}else {	
			System.out.print("AGC");
		}
		in.close();
	}
}