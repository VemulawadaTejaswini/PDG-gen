import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		if(i>0&&i<1000){
			System.out.println("ABC");
		}else if(i>=1000&&i<1999){
			System.out.println("ABD");
		}
	}
}