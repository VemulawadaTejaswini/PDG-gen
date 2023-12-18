import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		int n = Integer.parseInt(str1);
		
		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[n];
		
		String[] tmpArray = br.readLine().split(" ");
		for(int i = 0; i < n; i++){
			a[i] = Integer.parseInt(tmpArray[i]);
		}
		
		tmpArray = br.readLine().split(" ");
		for(int i = 0; i < n; i++){
			b[i] = Integer.parseInt(tmpArray[i]);
		}
		
		tmpArray = br.readLine().split(" ");
		for(int i = 0; i < n; i++){
			c[i] = Integer.parseInt(tmpArray[i]);
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		
		long result = 0;
		
		int[] bc = new int[n];
		long[] sumBC = new long[n + 1];
		
		int minC = n - 1;
		for(int i = n - 1; i >= 0; i--){
			if(minC == n - 1 && b[i] >= c[minC]){
				continue;
			}
			for(int j = minC ; j >= 0 ; j--){
				if(b[i] < c[j]){
					minC = j;
				}
				else {
					break;
				}
			}
			bc[i] = n - minC;
			sumBC[i] += bc[i] + sumBC[i + 1];
		}
		
		int minBC = n - 1;
		for(int i = n - 1; i >= 0; i--){
			if(minBC == n - 1 && a[i] >= b[minBC]){
				continue;
			}
			for(int j = minBC ; j >= 0; j--){
				if(a[i] < b[j]){
					minBC = j;
				}
				else {
					break;
				}
			}
			result += sumBC[minBC];
//			System.out.println("add "+sumBC[minBC] + " result "+result);
		}
//		for(int i = 0; i < n; i++){
//			for(int j = n - 1; j >= 0; j--){
//				if(b[i] < c[j]){
//					bc[i]++;
//				}
//				else {
//					break;
//				}
//			}
//		}
		
//		for(int i = 0; i < n; i++){
//			long tmp = 0;
//			for(int j = n - 1; j >= 0; j--){
//				if(a[i] < b[j]){
//					tmp += bc[j];
//				}
//				else {
//					break;
//				}
//			}
//			result += tmp;
//		}
//		//素朴法
//		for(int i = 0; i < n; i++){
//			for(int j = 0; j < n; j++){
//				if(a[i] >= b[j]){
//					continue;
//				}
//				for(int k = n - 1; k >= 0; k--){
//					if(b[j] < c[k]){
//						result++;
//					}
//					else {
//						break;
//					}
//				}
//			}
//		}
		
		System.out.println(result);
	}

}
