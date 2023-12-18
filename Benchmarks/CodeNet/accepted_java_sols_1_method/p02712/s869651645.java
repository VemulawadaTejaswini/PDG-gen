import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		long s=0;
		for(int i=1; i<=N; i++) {
			if(i%3==0 && i%5==0) continue;
			if(i%3==0) continue;
			if(i%5==0) continue;
			s+=i;
		}
		System.out.println(s);
	}
}