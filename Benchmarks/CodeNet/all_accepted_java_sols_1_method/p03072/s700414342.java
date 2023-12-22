import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int height = 0;
		int max = 0;
		int seen = 0;
		
		for(int i = 1; i <= N; i++) {
			height = sc.nextInt();
			if(max <= height) {
				seen ++;
				max = height;
			}
		}
			System.out.println(seen);
	}
}