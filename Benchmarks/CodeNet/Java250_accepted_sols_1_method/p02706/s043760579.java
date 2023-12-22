import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int total = 0;
		int N = scan.nextInt(); //夏休みは　Ｎ　日間
		int M = scan.nextInt(); //宿題はM個
		
		while(true) {
			if(i == M) break;
			int A = scan.nextInt(); //日数
			total += A;
			i++;
		}
		if(N >= total) {
			N -= total;
			System.out.println(N);
		} else if(N < total) {
			System.out.println("-1");
		}
		
	}

}