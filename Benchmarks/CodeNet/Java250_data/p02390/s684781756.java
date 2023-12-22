import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int time = scan.nextInt();
		scan.close();
		int h,m,s;
		s = time % 60;
		m = time / 60;
		h = m / 60;
		m = m - h * 60;
		String answer =h + ":" + m +":" + s;
		System.out.println(answer);
	}
}