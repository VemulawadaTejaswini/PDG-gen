import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();

		int num[]={a,b,c,d,e};
		Arrays.sort(num);

		for(int i=4;i>=0;i--){
		System.out.print(num[i]+" ");
		}

	}

}