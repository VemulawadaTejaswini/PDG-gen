import java.util.*;
public class Main{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int h1 = scan.nextInt();
		int m1 = scan.nextInt();
		int h2 = scan.nextInt();
		int m2 = scan.nextInt();
		int k = scan.nextInt();
		int di = (h2*60+m2 - (h1*60+m1));
		System.out.print(di - k);

	}
}