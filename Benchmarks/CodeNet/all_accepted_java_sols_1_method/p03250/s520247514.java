import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nn = sc.nextInt();
		int nnn = sc.nextInt();

		int[] a = new int[6];

		a[0]  = ((n*10)+nn) + nnn;
		a[1]  = ((n*10)+nnn) + nn;
		a[2]  = ((nn*10)+nnn) + n;
		a[3]  = ((nn*10)+n) + nnn;
		a[4]  = ((nnn*10)+n) + nn;
		a[5]  = ((nnn*10)+ nn) + n;

		Arrays.sort(a);

		System.out.println(a[5]);


	}
}