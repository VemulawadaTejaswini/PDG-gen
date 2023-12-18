import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int i = 0;
		while(true){
			int x = in.nextInt();
			i++;
			if(x == 0)break;
			System.out.println("Case "+ i + ": " + x);
		}
	}
}