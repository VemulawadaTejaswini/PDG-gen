import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	public static int dps(int num, int selected, int[] weight){
		if(num > 10){
			return 0;
		}else if(num == 10){
			return 1;
		}
		
		int ret = 0;
		
		for(int i = selected; i >= 0; i--){
			if(weight[i] == 0){
				continue;
			}
			
			weight[i]--;
			int tmp = dps(num + i, i, weight);
			
			if(tmp > 0){
				ret += tmp;
			}else{
				weight[i]++;
			}
		}
		
		return ret;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			int[] weights = new int[11];
			
			for(int i = 0; i < n; i++){
				weights[sc.nextInt()]++;
			}
			
			System.out.println(dps(0, 10, weights));
			
		}
	}

}