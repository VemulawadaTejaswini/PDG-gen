import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int S = in.nextInt();
		int h = S / 3600;
		int m = (S / 60)%60;
		int s = S % 60;
		System.out.print(h +":"+ m + ":"+s);
		System.out.println("");
	}
}