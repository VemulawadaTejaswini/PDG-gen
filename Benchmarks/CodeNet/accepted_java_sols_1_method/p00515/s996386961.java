

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = Math.max(40, sc.nextInt());
		int b = Math.max(40, sc.nextInt());
		int c = Math.max(40, sc.nextInt());
		int d = Math.max(40, sc.nextInt());
		int e = Math.max(40, sc.nextInt());
		System.out.println((a+b+c+d+e)/5);
	}
}