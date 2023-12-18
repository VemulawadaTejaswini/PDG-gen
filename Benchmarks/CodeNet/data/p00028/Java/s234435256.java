import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] cnt = new int[100];
		int max = 0;
		for(int i = 0;i<100;i++){
			cnt[i] = 0;
		}
		while(sc.hasNext()){
			int number = sc.nextInt();
			cnt[number-1] += 1;
		}
		for(int j = 0;j<100;j++){
			if(cnt[j] >= max){
				max = cnt[j];
			}
		}
		for(int k = 0;k < 100;k++){
			if(cnt[k] == max){
				System.out.println(k+1);
			}
		}
	}
}