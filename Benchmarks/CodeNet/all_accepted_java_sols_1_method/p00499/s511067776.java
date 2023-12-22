import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int x = 0,y = 0;
		int l = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		while(a > 0){
			a -= c;
			x++;
		}
		while(b > 0){
			b -= d;
			y++;
		}
		System.out.println(l - Math.max(x, y));
		
		sc.close();
	}
}