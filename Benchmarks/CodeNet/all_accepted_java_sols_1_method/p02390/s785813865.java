import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int S=sc.nextInt();
		int m,h;
		m=S/60;
		h=m/60;
		System.out.println(h%24+":"+m%60+":"+S%60);
	}

}