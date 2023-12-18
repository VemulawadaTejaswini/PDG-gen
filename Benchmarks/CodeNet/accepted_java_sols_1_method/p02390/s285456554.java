
import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main (String args[]) throws IOException{

		Scanner sc = new Scanner(System.in);

		int sec = sc.nextInt();

		// ?¨??????????
//		int hour = sec / 3600;
//		int minuts = (sec % 3600) / 60;
//		int seconds = sec % 60;
//		
//		System.out.println();

		System.out.println((sec / 3600) + ":" + ((sec % 3600) / 60) + ":" + (sec % 60) );
		sc.close();
	}
}