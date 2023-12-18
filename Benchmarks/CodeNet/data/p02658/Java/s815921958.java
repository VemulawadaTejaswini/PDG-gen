import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner std = new Scanner(System.in);
		int N = std.nextInt();
		long[] a = new long[N];
		for(int i = 0; i < N; i++)
			a[i] = std.nextLong();

		int aaa = 0;
		long answer = 1;
		for(int i = 0; i < N; i++)
			aaa += String.valueOf(a[i]).length();
		if(aaa >= 19)
			answer = -1;
		else{
			for(int i = 0; i < N; i++)
				answer = a[i] * answer;
		}
		System.out.println(answer);
	}

}
