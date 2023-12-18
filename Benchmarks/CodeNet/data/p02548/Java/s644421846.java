import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count =0;
		for (int i=1;i<=N;i++) {
			int b;
			for (b=1;b*b<N-i;b++) {
				if ((N-i)%b==0) {
					count +=2;
				}
			}
			if (b*b==(N-i)) {
				count +=1;
			}
		}
		System.out.println(count);
	}
}
