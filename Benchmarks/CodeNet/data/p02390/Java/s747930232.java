import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int h=x/(60*60);
		int m=(x%(60*60))/60;
		int s=x-(h*60*60)-(m*60);
		System.out.print(h + ":" + m + ":" + s);

	}

}

