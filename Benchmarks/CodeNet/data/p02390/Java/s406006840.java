import java.util.Scanner;

public class Main {
public static void main(String args[]) {
	int h,m,s,x;
	Scanner a = new Scanner(System.in);
	x = a.nextInt();
	
	h = x / 3600;
	m = x % 3600 / 60;
	s = m % 60;
	System.out.println(h +":"+ m + ":" + s);
}
}