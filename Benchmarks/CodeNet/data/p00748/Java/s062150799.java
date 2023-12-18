import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int[] min = new int[1000000 + 1];
	static int[] oddmin = new int[1000000 + 1];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Arrays.fill(min, -1);
		min[1] = 1;
		Arrays.fill(oddmin, -1);
		oddmin[1] = 1;
		while(n != 0){
			System.out.println(func(n) + " " + oddfunc(n));
			n = sc.nextInt();
		}
		
		sc.close();
	}
	static int func(int n){
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
		if(oddmin[n] > 0){
			return oddmin[n];
		}
		int res = 20000;
		int tmp = n;
		for(int i = 1; i < n; i += 2){
			tmp = i * (i + 1) * (i + 2) / 6;
			if(tmp % 2 != 0){
				if(n == tmp){
					oddmin[n] = 1;
					return oddmin[n];
				}else if(n > tmp){
					res = Math.min(res, oddfunc(n - tmp) + 1);
				}else if(n < tmp){
					break;
				}
			}
		}
		oddmin[n] = res;
		return res;
	}

}