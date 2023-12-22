import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] data = new int[126];
		int n = sc.nextInt() - 1;
		int copy = n;
		while ( n >= 0 )
			data[n--] = sc.nextInt();
		n = 0;
		while ( n < copy )
			System.out.print(data[n++]+" ");
		System.out.println(data[n]);
	}
}