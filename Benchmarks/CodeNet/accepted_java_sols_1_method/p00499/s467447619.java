import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int j = a/c, m = b/d, r;
		if(a%c!=0)j+=1;
		if(b%d!=0)m+=1;
		if(j>=m) r = l-j;
		else r = l-m;
		System.out.println(r);
	}

}