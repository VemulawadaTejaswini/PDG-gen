package kadai;
import java.util.Scanner;
public class kadai {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] d = new int[3];
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a < b && a < c)
			d[0] = a;
		else if (a < b)
			d[1] = a;
		else
			d[2] = a;
		if (b < a && b < c)
			d[0] = b;
		else if (b < c)
			d[1] = b;
		else
			d[2] = b;
		if (c < a && c < b)
			d[0] = c;
		else if (c < b)
			d[1] = c;
		else
			d[2] = c;
		for (int i = 0; i < d.length; i++)
			System.out.print(d[i] + " ");
		System.out.println();
		sc.close();
	}

}

