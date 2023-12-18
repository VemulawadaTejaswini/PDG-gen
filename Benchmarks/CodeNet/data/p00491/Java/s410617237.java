
import java.util.*;
import static java.lang.Math.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int days = N - K;
		boolean check = true;
		int[] Aidx = new int[K];
		int[] ptable = new int[N];
		for(int i = 0; i < N; i++) ptable[i] = 1;
		for(int i = 0; i < K; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			ptable[A - 1] = B;
			Aidx[i] = A;
		}
		Arrays.sort(Aidx);
		int result = 0;
		int deep = 0;
		for(int i = 0; i < ptable.length; i++) {
			if(i >= 2 && ptable[i] == ptable[i - 1]
					  && ptable[i - 1] == ptable[i - 2]) {
				check = false;
				break;
			}
		}
		if(check) result++;
		for(int j = 0; j < (int)pow(3.0,(double)days) - 1; j++) {
			ptable[Aidx[deep]] += 1;
			while(true) {
				if(ptable[Aidx[deep]] == 4) {
				ptable[Aidx[deep]] = 1;
				deep++;
				ptable[Aidx[deep]]++;
				} else {
					break;
				}
			}
			check = true;
			for(int i = 0; i < ptable.length; i++) {
				if(i >= 2 && ptable[i] == ptable[i - 1]
						  && ptable[i - 1] == ptable[i - 2]) {
					check = false;
					break;
				}
			}
			if(check) result++;
			deep = 0;
		}
		System.out.println(result % 10000);
		System.exit(0);
	}
}