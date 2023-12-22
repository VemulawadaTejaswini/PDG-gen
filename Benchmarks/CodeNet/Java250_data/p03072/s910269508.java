import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(),base=sc.nextInt(),ans=1;
		for(int i=1;i<N;i++) {
			int tmp = sc.nextInt();
			if(base<=tmp) ans++;
			if(tmp>base) base=tmp;
		}
		System.out.println(ans);
	}
}
