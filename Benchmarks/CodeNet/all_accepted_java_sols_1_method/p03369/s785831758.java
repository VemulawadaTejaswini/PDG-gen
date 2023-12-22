import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c= sc.next().toCharArray();
		int res = 700;
		if (c[0] == 'o') res+=100;
		if (c[1] == 'o') res+=100;
		if (c[2] == 'o') res+=100;
		System.out.println(res);
	}
}
