import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		sc.close();

		int ans1 = Math.min(A,B);
		int ans2 = 0;

		int num = Math.abs(A+B)-N;
		if(num>0)ans2=num;

		System.out.println(ans1+" "+ans2);

	}

}
