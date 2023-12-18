

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a[] = new int[3];
		Scanner sc = new Scanner(System.in);
		a[0] = sc.nextInt();
		a[1] = sc.nextInt();
		a[2] = sc.nextInt();
		sc.close();
		Arrays.sort(a);
		if(a[0]==a[1] && a[1]==a[2]) System.out.println("1");
		else if(a[0]==a[1] || a[1]==a[2])System.out.println("2");
		else System.out.println("3");
	}

}
