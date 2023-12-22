import java.util.Scanner;

// 8
class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ab = Integer.valueOf(String.format("%d%d", a, b));
		
		int x = 1;
		String ans = "No";
		while (ab >= x*x) {
			if(ab == x*x) { 
				ans = "Yes";
				break;
			}
			++x;
		}
		System.out.println(ans);
	}

}
