import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t = sc.nextInt();
		int h,m,s;
		h = t / 3600;
		t %= 3600;
		m = t/60;
		s = t%60;
		System.out.println(h + ":" + m + ":" + s);
		
	}

}