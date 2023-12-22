import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int x = e*a;
		int y = 0;
		if(c<e){
			y=b+(e-c)*d;
		}else{
			y=b;
		}
		if(y<x) System.out.println(y);
		else System.out.println(x);
	}
}