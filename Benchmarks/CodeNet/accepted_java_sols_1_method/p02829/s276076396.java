import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = 0;
		if(a==1 && b==2) { ans = 3; } else
		if(a==1 && b==3) { ans = 2; } else
		if(a==2 && b==1) { ans = 3; } else
		if(a==2 && b==3) { ans = 1; } else
		if(a==3 && b==1) { ans = 2; } else
		if(a==3 && b==2) { ans = 1; }
		System.out.println(ans);
	}
}
