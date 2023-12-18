import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ai = new int[21];

		while(true){
			int a0 = sc.nextInt();
			int digits = sc.nextInt();
			if(a0==0&&digits==0) break;
			int[] num = new int[digits];
			int i = 0, k;

			ai[0] = a0;
			while(true){
				int max = 0, min = 0;
				int temp = ai[i];
				for(int j=0; j<digits; j++){
					num[j] = temp % 10;
					temp /= 10;
				}
				Arrays.sort(num);

				for(int j=0; j<digits; j++){
					max *= 10;
					min *= 10;
					min += num[j];
					max += num[digits-1-j];
				}
				ai[++i] = max - min;
				k = Check(ai, i);
				if(k!=-1){
					System.out.printf("%d %d %d\n", k, ai[i], i-k);
					break;
				}
			}
		}
	}
	
	static int Check(int[] ai, int i){
		for(int j=0; j<i; j++){
			if(ai[j]==ai[i]){
				return j;
			}
		}
		return -1;
	}
}