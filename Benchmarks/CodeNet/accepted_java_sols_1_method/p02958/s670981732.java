import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int p[] = new int[N];
		int count = 0;
		
		for(int i=0;i<N;i++) {
			p[i] = sc.nextInt();
			if(p[i] != i+1) {
				count = count + 1;
			}
		}
		if(count == 2 || count ==0) {
			System.out.println("YES");			
		}else {
			System.out.println("NO");
		}
	}
}