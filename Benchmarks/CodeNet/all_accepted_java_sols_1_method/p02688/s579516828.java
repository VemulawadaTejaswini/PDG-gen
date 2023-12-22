import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int treats[] = new int[N];
		for(int k = 0 ; k < K ; ++k){
			int d = sc.nextInt();
			for(int i = 0 ; i < d ; ++i){
				int a = sc.nextInt();
				treats[a - 1]++;
			}
		}
		int ret = 0;
		for(int t : treats){
			if(t == 0){
				++ret;
			}
		}
		System.out.println(ret);
	}
}
