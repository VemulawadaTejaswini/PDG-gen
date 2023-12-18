import java.util.Scanner;
public class ITP1_1D {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int h,m,s;
			h = x / 3600;
			m = ( x - h * 3600 ) / 60;
			s = x - h * 3600 - m * 60;
		System.out.println(h + ":" + m + ":" + s);
	}

}