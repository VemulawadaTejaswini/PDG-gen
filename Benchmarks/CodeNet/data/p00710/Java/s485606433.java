import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int card[], tmp[];
		int i, j;
		while(true){
			int n = sc.nextInt();
			int r = sc.nextInt();
			if(n == 0)
				break;
			card = new int[n];
			for(i = 1; i <= n; i++){
				card[n - i] = i;
			}
			for(i = 0; i < r; i++){
				int p = sc.nextInt();
				int c = sc.nextInt();
				tmp = new int[c];
				for(j = 0; j < c; j++){
					tmp[j] = card[p - 1 + j];
				}
				for(j = p - 2; j >= 0; j--){
					card[j + c] = card[j];
				}
				for(j = 0; j < c; j++){
					card[j] = tmp[j];
				}
			}
			System.out.printf("%d\n", card[0]);
		}
	}
}