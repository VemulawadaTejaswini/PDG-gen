

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigDecimal tmp = BigDecimal.ZERO;
		int i, j, a, b;
		BigDecimal meu, rinrin, hoga;
		BigDecimal[] array = new BigDecimal[n];
		BigDecimal[] fuga = new BigDecimal[n];
		for(i = 0;i < n;++i){
			array[i] = BigDecimal.valueOf(sc.nextInt());
		}
		Arrays.sort(array);
		for(i = 0;i < n;++i){
			meu = array[i];
			for(j = 0;j < n;++j){
				if(j != i){
					if((i == n-1 && j == n-2) || (j == n-2 && i == n-1)){
						a = 2;
					}else if(i == n-1 || j == n-1 || i == n-2 || j == n-2){
						a = 1;
					}else{
						a = 0;
					}
					rinrin = array[j];
					fuga = array.clone();
					fuga[j] = BigDecimal.ZERO;
					fuga[i] = BigDecimal.ZERO;
					
					hoga = fuga[n-1-a].add(fuga[n-2-a]).divide(meu.subtract(rinrin).abs(), 8, BigDecimal.ROUND_HALF_UP);
					if(tmp.compareTo(hoga) < 0) tmp = hoga;
				}
			}
		}
		
		System.out.println(tmp);
	}
}