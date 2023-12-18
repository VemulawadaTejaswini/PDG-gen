import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int a0 = 0, a2 = 0, a4 = 0;
		for(int i = 0;i < N;i ++) {
			int a = scn.nextInt();
			if(a%4==0) {
				a4++;
			}else if(a % 2 == 0) {
				a2++;
			}else {
				a0++;
			}
		}
		boolean ans = a4 >= a0 || a4 == N/2;
		System.out.println(ans?"Yes":"No");
	}

}
