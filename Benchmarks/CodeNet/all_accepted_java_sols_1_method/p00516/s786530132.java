import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int kyo = sc.nextInt();
		int iin = sc.nextInt();
		int kyohi[] = new int[kyo];
		int cnt[] = new int[kyo];
		int kijun[] = new int[iin];
		for(int i = 0; i < kyo; i++){
			kyohi[i] = sc.nextInt();
			cnt[i] = 0;
		}
		for(int i = 0; i < iin; i++){
			kijun[i] = sc.nextInt();
		}
		for(int j = 0; j < iin; j++){
			for(int k = 0; k < kyo; k++){
				if(kyohi[k] <= kijun[j]){
					cnt[k] = cnt[k] + 1;
					break;
				}
			}
		}
		int max = cnt[0];
		int soe = 1;
		for(int i = 1; i < kyo; i++){
			if(max < cnt[i]){
				max = cnt[i];
				soe = i + 1;
			}
		}
		System.out.println(soe);
	}
}