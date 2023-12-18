import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] num = new int[n];
		
		int flag = 0;
		
		for (int i = 0; i < m; i++) {
			int s = sc.nextInt();
			int c = sc.nextInt();
			
			//「S=1,c=0」かつ「出力する整数が1桁ではない」
			//もしくは
			//「s桁目が0ではない」かつ「s桁目がcと一致しない」
			if(s == 1 && c ==0 && n != 1 || num[s - 1] != 0 && num[s - 1] != c){
				flag = 1;
			}else{
				num[s - 1] = c;
			}
		}
		
		if(flag == 1){
			System.out.println("-1");
		}else{
			//「1桁目が0」かつ「出力する整数が1桁ではない」
			if(num[0] == 0 && n != 1){
				num[0] = 1;
			}
			for (int i = 0; i < n; i++) {
				System.out.print(num[i]);
			}
		}
	}
}
