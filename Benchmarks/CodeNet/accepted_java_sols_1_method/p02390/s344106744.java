

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int S=scanner.nextInt();
		int h=S/3600;
		int amari=S-h*3600;
		int m=amari/60;
		int s=amari%60;
		System.out.println(h+":"+m+":"+s);

	}

}

