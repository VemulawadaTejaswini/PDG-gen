import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[4];
		for(int i = 0;i < 4;i ++) {
			int N = sc.nextInt();
			if(N == 1) n[0]++;
			else if(N == 9) n[1]++;
			else if(N == 7) n[2]++;
			else if(N == 4) n[3]++;
		}
		if(n[0] == 1 && n[1] == 1 && n[2] == 1 && n[3] == 1) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}