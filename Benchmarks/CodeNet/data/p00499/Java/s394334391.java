import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		int k = 0;
		int s = 0;
		int l = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		if(a % c == 0) k = a / c;
		else k = a / c + 1;
		if(b % d == 0) s = b / d;
		else s = b / d + 1;
		if(k >= s) System.out.println(l - k);
		else System.out.println(l - s);
	}
}