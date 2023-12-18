import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = a + b;
		
		int cnt = 0;
		
		System.out.println(a + " " + b);
		
		//?????°????¨????
		while(sum > 0) {
			sum = sum / 10;
			cnt++;
		}
		
		System.out.println(cnt);
	}
}