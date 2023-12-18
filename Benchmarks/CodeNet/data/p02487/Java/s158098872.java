import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int H, W;

	public static void main(String[] args) {
		while(read()) {
			solve();
			System.out.println();
		}
	}

	static boolean read() {
		if(!sc.hasNextInt()) return false;
		H = sc.nextInt();
		W = sc.nextInt();

		if(H == 0){
			if(W == 0) {
				return false;
			}
		}

		return true;
	}

	static void solve() {
		for(int i=0;i < W; i++){
			System.out.print("#");
		}
		System.out.println();

		for(int i = 0; i < H - 2; i++) {
			System.out.print("#");
			for(int j = 0; j < W - 2; j++) {
				System.out.print(".");
			}
			System.out.println("#");
		}

		for(int i=0;i < W; i++){
			System.out.print("#");
		}
		System.out.println();

		return;
	}

}