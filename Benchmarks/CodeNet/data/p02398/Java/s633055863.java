
import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt(),b = scn.nextInt(),c = scn.nextInt(),n = 0;
		for(int i = a;i <=b;i++ ) {
			if(c % i == 0)n++;
		}
		System.out.println(n);
	}
}

