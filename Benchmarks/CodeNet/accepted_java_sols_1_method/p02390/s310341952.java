import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int ip;
	public static void main(String[] args) {
		ip=sc.nextInt();
		int h = ip/(60*60);int tmp = ip%(60*60);
		int m = tmp/60;
		int s=tmp%60;
		
		System.out.println(h+":"+m+":"+s);
		
	}

}