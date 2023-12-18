import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int length_t = sc.nextInt(), length_h = sc.nextInt();
			if(length_t==0&&length_h==0) break;
			int[] taro = new int[length_t];
			int[] hanako = new int[length_h];
			int sum_t = 0;
			for(int i=0; i<length_t; i++){
				taro[i] = sc.nextInt();
				sum_t += taro[i];
			}
			int sum_h = 0;
			for(int i=0; i<length_h; i++){
				hanako[i] = sc.nextInt();
				sum_h += hanako[i];
			}
			int sum = sum_t + sum_h;
			if(sum%2==0){
				Arrays.sort(taro);
				Arrays.sort(hanako);
				int t, h;
				for(t=0; t<length_t; t++){
					h = Arrays.binarySearch(hanako, sum/2 - sum_t + taro[t]);
					if(h>=0){
						System.out.println(taro[t] + " " + hanako[h]);
						break;
					}else if(t==taro.length-1){
						System.out.println(-1);
					}
				}
				
			}else{
				System.out.println(-1);
			}
		}
	}
}