import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int nlist[] = new int[n];
		int mlist[] = new int[m];
		int sum = 0;
		int kazu;
		int count = 0;
		boolean nstop = false;
		for(int i = 0; i < n; i++) {
			nlist[i] = sc.nextInt();
		}
		for(int i = 0; i < m; i++) {
			mlist[i] = sc.nextInt();
		}
		int i = 0;
		int j = 0;
		while(true) {
			kazu = 0;
			if((count % 2 == 0 && i < n) ||( j == m && i < n)) {
				kazu = nlist[i];
				i++;
			}else if((count % 2 > 0 && j < m) || (i == n && j < m)) {
				kazu = mlist[j];
				j++;
			}
			if(sum -1000000000 + kazu > 0) {
				break;
			}
			sum += kazu;
			if(sum > k  || kazu == 0) {			//nlist,mlist両方を使い切ると,kazuは0のままになる(nとmの数字>0)
				break;
			}
			count++;
		}
		System.out.println(count);
	}

}