import java.util.Arrays;
import java.util.Scanner;

public class Main {
//	static int[] min = new int[1000000 + 1];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] min = new int[2][1000000 + 1];
		Arrays.fill(min[0], 20000);
		Arrays.fill(min[1], 20000);
		min[0][1] = 1;
		min[1][1] = 1;
		for(int i = 2; i <= 1000000; i++){
			for(int j = 1; j < i; j++){
				int tmp = j * (j + 1) * (j + 2) / 6;
				if(i == tmp){
					min[0][i] = 1;
				}else if(i > tmp){
					min[0][i] = Math.min(min[0][i], min[0][i - tmp] + 1);
				}else{
					break;
				}
			}
		}
		for(int i = 2; i <= 1000000; i++){
			for(int j = 1; j < i; j += 2){
				int tmp = j * (j + 1) * (j + 2) / 6;
				if(tmp % 2 != 0){
					if(i == tmp){
						min[1][i] = 1;
					}else if(i > tmp){
						min[1][i] = Math.min(min[1][i], min[1][i - tmp] + 1);
					}else{
						break;
					}
				}
			}
		}
		while(n != 0){
/*
			int[] test = new int[n + 1];
			Arrays.fill(test, 20000);
			test[1] = 1;
			for(int i = 2; i <= n; i++){
				for(int j = 1; j < i; j++){
					int tmp = j * (j + 1) * (j + 2) / 6;
					if(i == tmp){
						test[i] = 1;
					}else if(i > tmp){
						test[i] = Math.min(test[i], test[i - tmp] + 1);
					}else{
						break;
					}
				}
			}
			System.out.print(test[n]);
			Arrays.fill(test, 20000);
			test[1] = 1;
			for(int i = 2; i <= n; i++){
				for(int j = 1; j < i; j += 2){
					int tmp = j * (j + 1) * (j + 2) / 6;
					if(tmp % 2 != 0){
						if(i == tmp){
							test[i] = 1;
						}else if(i > tmp){
							test[i] = Math.min(test[i], test[i - tmp] + 1);
						}else{
							break;
						}
					}
				}
			}
			System.out.println(" " + test[n]);*/
			System.out.println(min[0][n] + " " + min[1][n]);
			n = sc.nextInt();
		}
		
		sc.close();
	}
/*	static int func(int n){
		if(min[n] > 0){
			return min[n];
		}
		int res = 20000;
		int tmp = n;
		for(int i = 1; i < n; i++){
			tmp = i * (i + 1) * (i + 2) / 6;
			if(n == tmp){
				min[n] = 1;
				return min[n];
			}else if(n > tmp){
				res = Math.min(res, func(n - tmp) + 1);
			}else if(n < tmp){
				break;
			}
		}
		min[n] = res;
		return res;
	}
	static int oddfunc(int n){
		if(min[n] > 0){
			return min[n];
		}
		int res = 20000;
		int tmp = n;
		for(int i = 1; i < n; i += 2){
			tmp = i * (i + 1) * (i + 2) / 6;
			if(tmp % 2 != 0){
				if(n == tmp){
					min[n] = 1;
					return min[n];
				}else if(n > tmp){
					res = Math.min(res, oddfunc(n - tmp) + 1);
				}else if(n < tmp){
					break;
				}
			}
		}
		min[n] = res;
		return res;
	}*/

}