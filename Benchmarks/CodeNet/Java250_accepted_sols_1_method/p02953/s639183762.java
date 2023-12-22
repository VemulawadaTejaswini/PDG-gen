import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int maxv = 0;
		boolean flg = true;
		for(int i = 0; i< N; i++) {
			int now = sc.nextInt();
			if(maxv < now) {
				maxv = now - 1;
			}else if(maxv == now){
				maxv = now;
			}else {
				flg = false;
				break;
			}
		}
		if(flg) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}