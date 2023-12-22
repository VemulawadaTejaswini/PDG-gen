import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();
		int res = 0;
		if (c[0] =='1') res++;
		if (c[1] =='1') res++;
		if (c[2] =='1') res++;
		System.out.println(res);
	}
}
