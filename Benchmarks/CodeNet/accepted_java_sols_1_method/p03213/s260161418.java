import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int max = sc.nextInt();
		int index[] = new int[101];
		int backet[] = new int[101];
		int prime[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		for(int i = 1; i <= max; i ++) {
			for(int j = 0; j < prime.length; j ++) {
				int crt = i;
				while(crt % prime[j] == 0) {
					index[prime[j]] ++;
					crt /= prime[j];
				}
			}
		}
		for(int i = 0; i < 101; i ++) {
			backet[index[i]] ++;
		}
		int a[] = new int[5];//2,4,14,74
		int b[] = {2, 4, 14, 24, 74};
		for(int i = 0; i < 5; i ++) {
			for(int j = b[i]; j < 101; j ++) {
				a[i] += backet[j];
			}
		}
		count = (a[0] - 2) * (a[1] - 1) * a[1] / 2
			+ (a[0] - 1) * a[3]
			+ (a[1] - 1) * a[2]
			+ a[4];
		System.out.println(count);
	}
}