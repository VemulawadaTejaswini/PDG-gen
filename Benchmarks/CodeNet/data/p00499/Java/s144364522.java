import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();

		int cnt1 = A/C;
		int cnt2 = B/D;

		if(A%C != 0)cnt1++;
		if(B%D != 0)cnt2++;

		if(cnt1 >= cnt2)System.out.println(L-cnt1);
		else System.out.println(L-cnt2);

	}

}