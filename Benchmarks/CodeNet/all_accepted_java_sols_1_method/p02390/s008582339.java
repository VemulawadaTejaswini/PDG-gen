import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		int x=i.nextInt();
		int s=x%60;
		x=x-s;
		int m=x%3600/60;
		x=x-m;
		int h=x/3600;
		System.out.println(h+":"+m+":"+s);
	}
}