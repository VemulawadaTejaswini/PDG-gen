import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int ans = 0;
		while(a != 0){
			while(true){
				if(a == 0){
					break;
				}
				ans += (a % 10);
				a = a / 10;
			}
			System.out.println(ans);
			a = sc.nextInt();
			ans = 0;
		}
	}
}