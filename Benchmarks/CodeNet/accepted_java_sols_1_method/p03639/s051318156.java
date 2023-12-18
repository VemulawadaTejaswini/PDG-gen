import java.util.Scanner;

class Main{
	public static void main(String args[]){
	    final int INF = Integer.MAX_VALUE/2;
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		int cnt_zero = 0, cnt_two = 0, cnt_four = 0;
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			if(a % 2 == 1) cnt_zero++;
			else if(a % 4 == 0) cnt_four++;
			else cnt_two++;
		}
		if(cnt_two > 0) {
			cnt_zero++;
		}
		System.out.println((cnt_zero - 1 <= cnt_four) ? "Yes" : "No");
	}
}