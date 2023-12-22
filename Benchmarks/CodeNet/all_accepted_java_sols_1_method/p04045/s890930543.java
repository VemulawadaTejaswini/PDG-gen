import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int[] D = new int[K];
		boolean next = false;
		for(int i = 0; i < K; i++) {
			D[i] = scan.nextInt();
		}
		while(true) {
			for(int i = 0; i < Integer.toString(N).length(); i++) {
				for(int j = 0; j < D.length; j++) {
					if(Integer.toString(N).substring(i, i + 1).equals(Integer.toString(D[j]))) {
						next = true;
						break;
					}
				}
				if(next) {
					break;
				}
			}
			if(next) {
				next = false;
				N++;
			} else {
				break;
			}
		}
		
		System.out.println(N);
		
		scan.close();
	}

}
