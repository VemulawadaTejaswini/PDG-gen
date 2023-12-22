import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[3];
		for(int i = 0; i < 3; i++) {
			n[i] = sc.nextInt();
		}
		for(int i = 0; i < 2; i++) {
			for(int j = i+1; j < 3; j++) {
				if(n[j] < n[i]) {
					int tmp = n[i];
					n[i] = n[j];
					n[j] = tmp;
				}
			}
		}

		String d = String.valueOf(n[2])+String.valueOf(n[1]);
		int ans = Integer.parseInt(d)+n[0];
		System.out.println(ans);
	}
}