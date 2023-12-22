import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int s=x%60;
		int mm=x/60;
		int m=mm%60;
		int h=mm/60;
		System.out.println(h+":"+m+":"+s);
	}
}
