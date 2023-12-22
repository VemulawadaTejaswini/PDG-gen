import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int s=0;
		s=(1000-N%1000)%1000;
		System.out.println(s);

	}

}