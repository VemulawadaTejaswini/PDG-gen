import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = a/3600;
		a %= 3600;
		int c = a/60;
		a %= 60;
		System.out.println(b+":"+c+":"+a);
	}
}