import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	    Scanner scan = new Scanner(System.in);
	    int in = scan.nextInt();
	    System.out.println((in%2==0)? in: in*2);
	    scan.close();
	}

}