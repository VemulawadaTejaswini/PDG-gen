import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());

		int count = 0;
		for(int i=1; i<=N; i++) {
			if(i % 2 == 0)continue;
			int a=0;
			for(int j=1;j<=i; j++) {
				if(i%j == 0) a++;
			}
			if(a==8)count++;
		}
		System.out.println(count);
	}
}
