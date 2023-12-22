import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int w = in.nextInt();
		int h = in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();
		boolean center = false;
		if(x*2==w && y*2==h) center = true;
		double area = ((double)w*(double)h)/2;
		String ans = area + " " + (center?"1":"0");
		System.out.println(ans);
		in.close();
	}

}
