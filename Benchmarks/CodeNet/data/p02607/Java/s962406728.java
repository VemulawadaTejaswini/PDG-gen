import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		for(int i = 0 ; i < N ; ++i){
			int a = sc.nextInt();
			if(i % 2 == 0){
				if(a % 2 == 1){
					++cnt;
				}
			}
		}
		System.out.println(cnt);
				
	}
}
