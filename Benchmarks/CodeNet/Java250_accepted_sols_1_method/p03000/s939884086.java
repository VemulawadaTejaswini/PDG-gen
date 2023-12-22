import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int sum = 0;
		int i;
		for(i = 0; i < N; i++) {
			sum += sc.nextInt();
			if(sum > X)break;
		}
		sc.close();
		System.out.println(i+1);
	}
}