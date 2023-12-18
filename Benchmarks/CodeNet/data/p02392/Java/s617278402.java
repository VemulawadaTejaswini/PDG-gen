import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc0 = new Scanner(args[0]);
		Scanner sc1 = new Scanner(args[1]);
		Scanner sc2 = new Scanner(args[2]);
		int a=sc0.nextInt();
		int b=sc1.nextInt();
		int c=sc2.nextInt();
		if(a<b&&b<c)System.out.println("yes");
		else System.out.println("no");
	}
	

}