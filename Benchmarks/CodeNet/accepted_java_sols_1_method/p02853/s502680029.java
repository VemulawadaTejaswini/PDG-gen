import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt();
		int ans = 0;
		if(x==3)ans += 100000;
		else if(x==2)ans+= 200000;
		else if(x==1)ans += 300000;
		if(y==3)ans += 100000;
		else if(y==2)ans+= 200000;
		else if(y==1)ans += 300000;
		if(x==1&&y==1)ans+=400000;
		System.out.println(ans);
		sc.close();
	}
}