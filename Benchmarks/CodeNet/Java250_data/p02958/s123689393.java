import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int [N];
		int culc = 0;
		int temp = 0;
		int number = 0;
		boolean ans = true;
		
		for(int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}

		for(int i = 0; i < N - 1; i++) {
			if(num[i + 1] < num[i]) {
				if(culc == 0) {
					temp = num[i];
					number = i;
					culc++;
				}else {
					num[number] = num[i + 1];
					num[i + 1] = temp;
				}
			}
		}
		
		for(int i = 0; i < N - 1; i++) {
			if(!(num[i] < num[i + 1])) {
				ans = false;
			}
		}
		
		if(ans) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		sc.close();
	}
}