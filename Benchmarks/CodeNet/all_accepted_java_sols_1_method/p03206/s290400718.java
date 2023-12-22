import java.util.Scanner;

public class Main{
	static public void  main(String[] args){
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		String m = "Christmas";
		for(int i = 25; i > a; i--){
			m += " Eve";
		}
		System.out.println(m);
	}
}
