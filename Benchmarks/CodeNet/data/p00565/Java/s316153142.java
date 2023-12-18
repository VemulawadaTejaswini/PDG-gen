import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main().mainrun();
	}

	private Scanner scan;
	private int N,ren,maxren;
	
	private void mainrun() {

		scan = new Scanner(System.in);

		ren = maxren = 0;
		
		N = scan.nextInt();
		
		for(int i = 0;i < N;i++) {
			int A = scan.nextInt();
			if(A == 1) {
				ren++;
			}else {
				maxren = Math.max(ren, maxren);
				ren = 0;
			}
		}
		
		System.out.println(Math.max(ren, maxren) + 1);
		
		scan.close();
	}
}

