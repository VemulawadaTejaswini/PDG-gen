//package volume_02;
// Railway Ticket


import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			boolean b1 = sc.nextInt() == 1;
			boolean b2 = sc.nextInt() == 1;
			boolean b3 = sc.nextInt() == 1;

			System.out.println(
					b1&&b2 || b3 ? "Open" : "Close");
		}
	}
}