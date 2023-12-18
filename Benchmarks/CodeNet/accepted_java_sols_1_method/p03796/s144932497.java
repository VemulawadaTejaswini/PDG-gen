import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		long a=1;
		long x=1;
		for(int i=0;i<9;i++) {
			x *=10;
		}
		for(int i=1;i<=c;i++) {
			a = a*i;
			a =  a % (x+7);
		}
		System.out.print(a);
		sc.close();
	}
}