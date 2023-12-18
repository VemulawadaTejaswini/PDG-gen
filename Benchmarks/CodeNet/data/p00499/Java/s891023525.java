import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		double j, m;
		j = Math.ceil((double)(a / c));
		m = Math.ceil((double)(b / d));
		if(j > m) System.out.println(l - j);
		else System.out.println(l - m);
	}

}