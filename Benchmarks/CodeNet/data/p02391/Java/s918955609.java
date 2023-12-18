import java.io.*;
import java.util.Scanner;
class Main {
	public static void main(String[] args)throws IOException {
		 Scanner scn = new Scanner(System.in);
		    int a = scn.nextInt();
		    int b = scn.nextInt();
		if(a>b) {
			System.out.println("a>b");
		}
		else if(a<b) {
			System.out.println("a<b");
		}
		else if(a==b) {
			System.out.println("a==b");
		}
	}

}